package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Melon> melons = Arrays.asList(
                new Melon("Gac", 5500, "Europe"),
                new Melon("Bailan", 6000, "China"),
                new Melon("Watermelon", 1200, "Europe"),
                new Melon("Gac", 3400, "US"),
                new Melon("Bailan", 1300, "China")
        );

        for (Melon melon : melons) {
            System.out.println(melon);
        }

        System.out.println("\nBailan melons:");
        List<Melon> bailan = Filters.filterByType(melons, "Bailan");
        for (Melon x : bailan) {
            System.out.println(x);
        }
        System.out.println("\nMelons weight = 1200KG:");
        List<Melon> weightMelons = Filters.filterByWeight(melons, 1200, true);
        for (Melon x : weightMelons) {
            System.out.println(x);
        }
    }

}
