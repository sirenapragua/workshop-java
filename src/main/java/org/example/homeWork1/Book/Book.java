package org.example.homeWork1.Book;

public class Book implements Displayable {
    private String bookName;
    private String bookAuthor;
    private int bookYear;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, int bookYear) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookYear() {
        return bookYear;
    }


    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public void display() {
        System.out.println("Книга: " + bookName);
        System.out.println("Автор: " + bookAuthor);
        System.out.println("Год издания: " + bookYear);
    }
}