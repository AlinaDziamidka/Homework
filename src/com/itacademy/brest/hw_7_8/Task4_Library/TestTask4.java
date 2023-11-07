package com.itacademy.brest.hw_7_8.Task4_Library;

public class TestTask4 {
    public static void main(String[] args) {

        //array length is 1 but we try to add 2 books
        Library library = new Library(new LibraryBook[5]);

        Book book1 = new Book("The Trial", "Franz Kafka", "1925", "Absurdity of the judicial system");
        Book book2 = new Book("The Gambler", "Fyodor Dostoevsky", "1866", "Human weakness");

        library.addBook(book1);
        library.addBook(book2);

//        library.checkOutAllBooks();

//        library.checkOut(book1);
//        library.checkOut(book2);

        library.deleteBook(book1);

        library.checkOut(book1);
        library.checkOut(book2);
    }
}
