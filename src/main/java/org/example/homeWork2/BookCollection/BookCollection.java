package org.example.homeWork2.BookCollection;

import java.util.HashSet;

public class BookCollection {
    private final HashSet<Book> books;

    public BookCollection() {
        books = new HashSet<>();
    }

    public boolean addBook(Book book) {
        return books.add(book);
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }

    public boolean containsBook(Book book) {
        return books.contains(book);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BookCollection:\n");
        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }
}