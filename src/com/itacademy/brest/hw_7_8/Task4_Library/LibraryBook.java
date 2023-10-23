package com.itacademy.brest.hw_7_8.Task4_Library;

public class LibraryBook {

    private boolean available;
    private Book book;

    public LibraryBook(Book book) {
        this.book = book;
        this.available = true;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void checkOutBook() {
        available = false;
    }

    public void returnBook() {
        available = true;
    }

    public boolean isAvailable() {
        if (available) {
            System.out.println("This book is available");
            return true;
        } else {
            System.out.println("This book is not available");
            return false;
        }
    }
}