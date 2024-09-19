package org.example.homeWork2.PriceList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PriceList priceList = new PriceList();

        List<String> books = new ArrayList<>(List.of(
                "Война и мир",
                "To Kill a Mockingbird",
                "The Great Gatsby"
        ));

        List<Double> prices = new ArrayList<>(List.of(
                599.0,
                499.0,
                450.0
        ));

        // Добавляем книги и цены в priceList
        for (int i = 0; i < books.size(); i++) {
            priceList.addProduct(books.get(i), prices.get(i));
        }

        System.out.println("Начальный список цен на книги:");
        System.out.println(priceList);

        // Задаем индекс книги, цену которой хотим изменить (0, 1 или 2)
        int bookIndexToUpdate = 2; // Меняем здесь для выбора другой книги

        // Задаем процент повышения цены
        double increasePercentage = 6.0; // 6%

        String bookToUpdate = books.get(bookIndexToUpdate);
        double oldPrice = prices.get(bookIndexToUpdate);
        double newPrice = oldPrice * (1 + increasePercentage / 100);

        priceList.updatePrice(bookToUpdate, newPrice);

        System.out.printf("После повышения цены '%s' на %.1f%%:%n", bookToUpdate, increasePercentage);
        System.out.println(priceList);

        // Вычисляем и выводим сумму повышения
        double priceIncrease = newPrice - oldPrice;
        System.out.printf("Цена книги '%s' повышена на %.2f (%.1f%%) с %.2f до %.2f%n",
                bookToUpdate, priceIncrease, increasePercentage, oldPrice, newPrice);
    }
}