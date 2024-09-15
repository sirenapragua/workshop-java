package org.example.homeWork1.Book;

public class BookDemo {
    public static void main(String[] args) {
        // Create a new Book object using the no-argument constructor
        Book book = new Book();

        // Set the book properties using setters
        book.setBookName("Война и мир");
        book.setBookAuthor("Лев Толстой");
        book.setBookYear(1869);

        // Display the book information
        book.display();
    }
}