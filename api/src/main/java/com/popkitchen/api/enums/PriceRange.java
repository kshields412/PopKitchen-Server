package com.popkitchen.api.enums;

public enum PriceRange {
    $(1, 1.0, 10.0),
    $$(2, 11.0, 20.0),
    $$$(3, 21.0, 30.0),
    $$$$(4, 30.0);

    private int id;
    private double minPricePerPerson;
    private double maxPricePerPerson;

    PriceRange(int id, Double minPricePerPerson, Double maxPricePerPerson) {
        this.id = id;
        this.minPricePerPerson = minPricePerPerson;
        this.maxPricePerPerson = maxPricePerPerson;
    }

    PriceRange(int id, Double minPricePerPerson) {
        this.id = id;
        this.minPricePerPerson = minPricePerPerson;
    }
}
