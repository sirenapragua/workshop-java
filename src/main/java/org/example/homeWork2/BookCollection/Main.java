package org.example.homeWork2.BookCollection;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");// Дубликат

        BookCollection collection = new BookCollection();

        System.out.println("Добавление книг:");
        collection.addBook(book1);
        collection.addBook(book2);
        collection.addBook(book3);
        System.out.println(collection);

        System.out.println("\nУдаление книги:");
        collection.removeBook(book1);
        System.out.println(collection);

        System.out.println("\nПроверка наличия книг:");
        System.out.println("Книга 1 в коллекции: " + collection.containsBook(book1));
        System.out.println("Книга 2 в коллекции: " + collection.containsBook(book2));
    }
}