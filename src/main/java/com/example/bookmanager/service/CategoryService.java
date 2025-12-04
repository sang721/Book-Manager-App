package com.example.bookmanager.service;

import com.example.bookmanager.model.BookDocument;
import com.example.bookmanager.model.Category;
import com.example.bookmanager.respitory.BookRepository;
import jakarta.annotation.PostConstruct;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CategoryService {

    private final BookRepository bookRepository;
    private List<Category> categories;

    public CategoryService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @PostConstruct
    public void loadCategories() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            categories = mapper.readValue(
                    new ClassPathResource("data/categories.json").getFile(),
                    new TypeReference<List<Category>>() {}
            );
        } catch (IOException e) {
            e.printStackTrace();
            categories = List.of();
        }
    }

    public List<Category> getAll() {
        return categories;
    }

    public Category getById(Integer id) {
        if (categories == null) return null;
        return categories.stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public List<BookDocument> getTop10BooksByCategoryId(Integer categoryId) {
        return bookRepository.findTop10ByCategoryId(categoryId);
    }
    
    public Page<BookDocument> getBooksByCategoryId(Integer categoryId, int page, int size) {
        Pageable pageable = PageRequest.of(page, size); // page is 0-based
        return bookRepository.findByCategoryId(categoryId, pageable);
    }
}
