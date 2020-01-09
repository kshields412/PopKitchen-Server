package com.popkitchen.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FoodType {
    INDIAN(0, "Indian"),
    KOREAN(1,"Korean"),
    SEAFOOD(2, "Seafood"),
    GREEK(3, "Greek"),
    BARBEQUE(4, "Barbeque"),
    BREAKFAST(5, "Breakfast"),
    BAR_PUB_LOUNGE(6, "Bar/Pub/Lounge"),
    MEXICAN(7, "Mexican"),
    BRUNCH(8, "Brunch"),
    ASIAN_FUSION(9, "Asian Fusion"),
    BAKERY(10, "Bakery"),
    BURGERS(11, "Burgers"),
    CHINESE(12, "Chinese"),
    GLUTEN_FREE(13, "Gluten-Free"),
    CAJUN_CREOLE(14, "Cajun/Creole"),
    CARIBBEAN(15, "Caribbean"),
    CUBAN(16, "Cuban"),
    FRENCH(17, "French"),
    FOOD_TRUCK(18, "Food Truck"),
    HAPPY_HOUR(19, "Happy Hour"),
    ICE_CREAM(20, "Ice Cream"),
    ITALIAN(21, "Italian"),
    JAPANESE(22,"Japanese"),
    SUSHI(23, "Sushi"),
    SOUL_FOOD(24, "Soul Food"),
    THAI(25, "Thai"),
    VEGAN(26, "Vegan Friendly"),
    VEGETARIAN(27, "Vegetarian Friendly"),
    SPANISH(28, "Spanish"),
    SANDWICHES(29, "Sandwiches"),
    LATIN(30, "Latin American"),
    PIZZA(31, "Pizza");



    private String description;
    private int id;

    FoodType(int id, String description) {
        this.description = description;
        this.id = id;
    }

    @JsonValue
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public static FoodType fromName(String name) {
        for (FoodType t : FoodType.values()) {
            if (t.description.equalsIgnoreCase(name)) {
                return t;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "FoodType{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
