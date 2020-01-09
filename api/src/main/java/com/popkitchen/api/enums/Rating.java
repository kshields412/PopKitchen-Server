package com.popkitchen.api.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Rating {
    ONE(1, "One Star"),
    TWO(2, "Two Star"),
    THREE(3, "Three Star"),
    FOUR(4, "Four Star"),
    FIVE(5, "Five Star");

    private int id;
    private String description;

    Rating(int id, String description){
        this.id = id;
        this.description = description;
    }

    @JsonValue
    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public static Rating fromName(String name) {
        for (Rating r : Rating.values()) {
            if (r.description.equalsIgnoreCase(name)) {
                return r;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
