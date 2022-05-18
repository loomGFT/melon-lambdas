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
    public static List<Melon> filterByWeight(List<Melon> melons, int weight,String mode){
        List<Melon> filteredMelons = new ArrayList<>();
        if(melons == null || weight <= 0) {
            throw new IllegalArgumentException("Melons cannot be null");
        }
        if(melons.isEmpty()){
            return melons;
        }
        System.out.println("\nMelons weight "+weight);
        for (Melon melon : melons) {
            switch(mode) {
                case "eq":
                    if (melon.getWeight() == weight) {
                        filteredMelons.add(melon);
                    }
                    break;
                case "gt":
                    if (melon.getWeight() >= weight) {
                        filteredMelons.add(melon);
                    }
                    break;
                case "lt":
                    if (melon.getWeight() <= weight) {
                        filteredMelons.add(melon);
                    }
                    break;
            }
        }
        return filteredMelons;
    }

    public static List<Melon> filterMelons(List<Melon> melons, MelonPredicate predicate){
        if(melons == null){
            throw new IllegalArgumentException("Melons cannot be null");
        }
        List<Melon> result = new ArrayList<>();
        for(Melon melon: melons){
            if(melon != null && predicate.test(melon)){
                result.add(melon);
            }
        }
        return result;
    }

    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        if(list == null){
            throw new IllegalArgumentException("List cannot be null");
        }
        List<T> result = new ArrayList<>();
        for(T t : list){
            if(t!= null && predicate.test(t)){
                result.add(t);
            }
        }
        return result;
    }

}
