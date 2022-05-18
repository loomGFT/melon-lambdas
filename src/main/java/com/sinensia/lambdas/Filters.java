package com.sinensia.lambdas;

import java.util.ArrayList;
import java.util.List;

public final class Filters {
    public Filters() {
        throw new AssertionError("Utility class cannot be instantiated");
    }
    public static List<Melon> filterByType(List<Melon> melons, String type) {
        List<Melon> filteredMelons = new ArrayList<>();
        if(melons == null || type == null) {
            throw new IllegalArgumentException("Melons / type cannot be null");
        }
        if(melons.isEmpty()){
            return melons;
        }
        for (Melon melon : melons) {
            if (melon.getType().equalsIgnoreCase(type)) {
                filteredMelons.add(melon);
            }
        }
        return filteredMelons;
    }
    public static List<Melon> filterByWeight(List<Melon> melons, int weight, boolean exact){
        List<Melon> filteredMelons = new ArrayList<>();
        if(melons == null) {
            throw new IllegalArgumentException("Melons cannot be null");
        }
        if(melons.isEmpty()){
            return melons;
        }
        for (Melon melon : melons) {
            if(exact){
                if (melon.getWeight() == weight) {
                    filteredMelons.add(melon);
                }
            } else {
                if(melon.getWeight() >= weight) {
                    filteredMelons.add(melon);
                }
            }

        }
        return filteredMelons;
    }
}
