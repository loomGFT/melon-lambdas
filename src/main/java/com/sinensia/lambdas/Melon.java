package com.sinensia.lambdas;

public class Melon {
    private final String type;
    private final int weight;
    private final String origen;
    public Melon(String type, int weight, String origen ) {
        this.type = type;
        this.weight = weight;
        this.origen = origen;
    }

    public String getType() {
        return type;
    }

    public int getWeight() {
        return weight;
    }

    public String getOrigen() {
        return origen;
    }

    @Override
    public String toString() {
        return "Melon{" +
                "type='" + type + '\'' +
                ", weight=" + weight +
                ", origen='" + origen + '\'' +
                '}';
    }
}
