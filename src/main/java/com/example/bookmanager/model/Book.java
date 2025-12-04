package com.example.bookmanager.model;

public class Book {
    private String id;
    private String title;
    private String author;
    private double price;
    private Category category;
    private String bookImage;
    private String bookPdfLink;

    public Book(String id, String title, String author, double price, Category category, String bookImage, String bookPdfLink) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.category = category;
        this.bookImage = bookImage;
        this.bookPdfLink = bookPdfLink;
    }

    public String getId() { 
        return id; 
    }

    public String getTitle() { 
        return title; 
    }

    public String getAuthor() { 
        return author; 
    }

    public double getPrice() { 
        return price; 
    }

    public Category getCategory() { 
        return category; 
    }

    public String getCategoryId() {
        return category != null ? category.getId() : null;
    }

    public String getBookImage() {
        return bookImage;
    }

    public String getBookPdfLink() {
        return bookPdfLink;
    }
}
