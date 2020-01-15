package com.popkitchen.api.enums;

public enum PriceRange {
    $(1.0, 10.0),
    $$(11.0, 20.0),
    $$$(21.0, 30.0),
    $$$$(30.0);

    private int id;
    private double minPricePerPerson;
    private double maxPricePerPerson;

    PriceRange(Double minPricePerPerson, Double maxPricePerPerson) {
        this.id = ordinal();
        this.minPricePerPerson = minPricePerPerson;
        this.maxPricePerPerson = maxPricePerPerson;
    }

    PriceRange(Double minPricePerPerson) {
        this.id = ordinal();
        this.minPricePerPerson = minPricePerPerson;
        this.maxPricePerPerson = Double.MAX_VALUE;
    }
}
