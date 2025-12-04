package com.example.bookmanager.respitory;

import com.example.bookmanager.model.BookDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDetailsRepository extends MongoRepository<BookDetails, String> {

    BookDetails getById(String id);
}
