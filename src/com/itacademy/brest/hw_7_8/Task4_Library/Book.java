package com.itacademy.brest.hw_7_8.Task4_Library;

public class Book {

    private String title;
    private String author;
    private String year;
    private String description;

    public Book(String title, String author, String year, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
    }

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void getDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year " + year + ", Description: " + description);
    }
}


