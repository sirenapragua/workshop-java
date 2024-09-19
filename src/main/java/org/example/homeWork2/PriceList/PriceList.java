package org.example.homeWork2.PriceList;

import java.util.HashMap;

public class PriceList {
    private final HashMap<String, Double> prices;

    public PriceList() {
        prices = new HashMap<>();
    }

    public void addProduct(String name, double price) {
        prices.put(name, price);
    }

    public void updatePrice(String name, double newPrice) {
        if (prices.containsKey(name)) {
            prices.put(name, newPrice);
        } else {
            System.out.println("Товар '" + name + "' не найден в списке.");
        }
    }

    public Double getPrice(String name) {
        return prices.get(name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("PriceList:\n");
        for (var entry : prices.entrySet()) {
            sb.append(entry.getKey()).append(": ").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}