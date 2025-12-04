package com.example.bookmanager.controller;
import org.springframework.data.domain.Page;
import com.example.bookmanager.model.BookDetails;
import com.example.bookmanager.model.BookDocument;
import com.example.bookmanager.respitory.BookDetailsRepository;
import com.example.bookmanager.respitory.BookRepository;
import com.example.bookmanager.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class HomeController {

    private final CategoryService categoryService;
    private final BookRepository bookRepository; 
    private final BookDetailsRepository bookDetailsRepository;

    public HomeController(CategoryService categoryService, BookRepository bookRepository,
        BookDetailsRepository bookDetailsRepository
    ) {
        this.categoryService = categoryService;
        this.bookRepository = bookRepository;
        this.bookDetailsRepository = bookDetailsRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("categories", categoryService.getAll());
        return "Home"; 
    }

    @GetMapping("/category/{id}")
    public String category(
            @PathVariable("id") Integer categoryId,
            @RequestParam(defaultValue = "0") int page, // current page
            @RequestParam(defaultValue = "10") int size, // page size
            Model model
    ) {
        Page<BookDocument> bookPage = categoryService.getBooksByCategoryId(categoryId, page, size);

        model.addAttribute("books", bookPage.getContent()); // books in current page
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", bookPage.getTotalPages());
        model.addAttribute("categoryId", categoryId);
        model.addAttribute("category", categoryService.getById(categoryId));

        return "Category"; 
    }
    // Show book details using repository
    @GetMapping("/book/{id}")
    public String bookDetails(@PathVariable("id") String bookId, Model model) {

        BookDetails book = bookDetailsRepository.getById(bookId);

        if (book == null) {
            return "redirect:/"; 
        }

        model.addAttribute("book", book);
        return "BookDetail"; // Thymeleaf template for book details
    }

}
