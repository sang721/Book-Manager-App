package com.example.bookmanager.respitory;

import com.example.bookmanager.model.BookDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


@Repository
public interface BookRepository extends MongoRepository<BookDocument, String> {

    // Original top 10
    List<BookDocument> findTop10ByCategoryId(Integer categoryId);

    // Pagination version
    Page<BookDocument> findByCategoryId(Integer categoryId, Pageable pageable);
}

