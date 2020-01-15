package com.popkitchen.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum FoodType {
    INDIAN,
    KOREAN,
    SEAFOOD,
    GREEK,
    BARBEQUE,
    BREAKFAST,
    BAR_PUB_LOUNGE,
    MEXICAN,
    BRUNCH,
    ASIAN_FUSION,
    BAKERY,
    BURGERS,
    CHINESE,
    GLUTEN_FREE,
    CAJUN_CREOLE,
    CARIBBEAN,
    CUBAN,
    FRENCH,
    FOOD_TRUCK,
    HAPPY_HOUR,
    ICE_CREAM,
    ITALIAN,
    JAPANESE,
    SUSHI,
    SOUL_FOOD,
    THAI,
    VEGAN,
    VEGETARIAN,
    SPANISH,
    SANDWICHES,
    LATIN,
    PIZZA;



    private String description;
    private int id;

    FoodType() {
        this.description = name();
        this.id = ordinal();
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
