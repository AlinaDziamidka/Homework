package com.itacademy.brest.hw_7_8.Task4_Library;

import java.util.Objects;

public class Library {

    private LibraryBook[] books;

    public LibraryBook[] getBooks() {
        return books;
    }

    public Library(LibraryBook[] books) {
        this.books = books;
    }

    public void setBooks(LibraryBook[] books) {
        this.books = books;
    }

    public void addBook(Book book) {
        LibraryBook libraryBook = new LibraryBook(book);
        for (int i = 0; i < books.length; i++) {
            if (Objects.isNull(books[i])) {
                books[i] = libraryBook;
                System.out.println("Book was successfully added");
                return;
            }
        }
    }

    public void checkOut(Book book) {
        for (int i = 0; i < books.length; i++) {
            LibraryBook libraryBook = books[i];
            if (Objects.nonNull(libraryBook) && libraryBook.getBook().equals(book) && libraryBook.isAvailable()) {
                libraryBook.checkOutBook();
                System.out.println("The book was successfully booked");
                return;
            }
        }
    }

    public void checkOutAllBooks() {
        for (LibraryBook libraryBook : books) {
            if (Objects.nonNull(libraryBook)) {
                libraryBook.getBook().getDetails();
                libraryBook.checkOutBook();
            }
        }
    }

    public void deleteBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (Objects.nonNull(books[i]) && books[i].getBook().equals(book)) {
                books[i] = null;
                System.out.println("The book was successfully deleted");
            }
        }
    }
}
