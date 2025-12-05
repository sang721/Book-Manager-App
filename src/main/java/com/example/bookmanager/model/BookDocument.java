package com.example.bookmanager.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
public class BookDocument {

    @Id
    private String id;
    private String title;
    private String author;
    private String category; 
    
    @Field("category_id")
    private Integer categoryId;    // numeric ID
    
    private String bookSlug;

    @Field("book_image")
    private String bookImage;
    private String bookPdfUrl;


    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public Integer getCategoryId() { return categoryId; }
    public void setCategoryId(Integer categoryId) { this.categoryId = categoryId; }

    public String getBookSlug() { return bookSlug; }
    public void setBookSlug(String bookSlug) { this.bookSlug = bookSlug; }

    public String getBookImage() { return bookImage; }
    public void setBookImage(String bookImage) { this.bookImage = bookImage; }

    public String getBookPdfUrl() { return bookPdfUrl; }
    public void setBookPdfUrl(String bookPdfUrl) { this.bookPdfUrl = bookPdfUrl; }

}
