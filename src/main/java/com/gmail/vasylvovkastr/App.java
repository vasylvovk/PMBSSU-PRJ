package com.gmail.vasylvovkastr;

import java.util.Arrays;
import java.util.Date;

/**
 * Hello world!
 */
public class App {
    public static void main(String... args) {
        Prodact cookie00 = new Prodact("Ovsyanne", "Bulochkina fabrika",
                new Date(), 20, 40, 1000, 10, "Pechivo");
        Prodact cookie01 = new Prodact("Ovsyanne", "Bulochkina fabrika",
                new Date(), 20, 40, 1000, 10, "Pechivo");
        Prodact cookie02 = new Prodact("Jyitnye", "Hlibna fabrika", new Date(),
                20, 40, 1000, 10, "Pechivo");
        Store store00 = new Store(100, "00", "dkjlfcnjds 100", "Anonimus");

        store00.addNewProdact(cookie00);
        store00.addNewProdact(cookie01);
        store00.addNewProdact(cookie02);

        System.out.println(store00.toString());
    }
}
