package com.example.bookmanager.model;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "books")
public class BookDetails {

    @Id
    private String id;
    private String title;
    private String author;
    private String category; 
    private String description;

    @Field("category_id")
    private Integer categoryId;   
    
    private String bookSlug;

    @Field("book_image")
    private String bookImage;

    @Field("book_pdf_url")
    private String bookPdfUrl;
    private List<String> chapters;  

    // Getters and setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description;}

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

    public List<String> getChapters() { return chapters; }
    public void setChapters(List<String> chapters) { this.chapters = chapters; }
}
