package com.popkitchen.api.model;

import javax.persistence.Entity;

@Entity
public class Kitchen {
    private String kitchenName;
    private String foodType;
    private int rating;
    private int priceRange;
    private String location;
    private int zipcode;
    private String description;
    private HoursOfOperation hoursOfOperation;
    private String phoneNumber;

}
