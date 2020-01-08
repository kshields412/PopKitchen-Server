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

    public Kitchen(String kitchenName, String foodType, int rating, int priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation, String phoneNumber) {
        this.kitchenName = kitchenName;
        this.foodType = foodType;
        this.rating = rating;
        this.priceRange = priceRange;
        this.location = location;
        this.zipcode = zipcode;
        this.description = description;
        this.hoursOfOperation = hoursOfOperation;
        this.phoneNumber = phoneNumber;
    }
    public Kitchen(String kitchenName, String foodType, int priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation, String phoneNumber) {
        this.kitchenName = kitchenName;
        this.foodType = foodType;
        this.priceRange = priceRange;
        this.location = location;
        this.zipcode = zipcode;
        this.description = description;
        this.hoursOfOperation = hoursOfOperation;
        this.phoneNumber = phoneNumber;
    }

    public Kitchen(String kitchenName, String foodType, int rating, int priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation) {
        this.kitchenName = kitchenName;
        this.foodType = foodType;
        this.rating = rating;
        this.priceRange = priceRange;
        this.location = location;
        this.zipcode = zipcode;
        this.description = description;
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getKitchenName() {
        return kitchenName;
    }

    public void setKitchenName(String kitchenName) {
        this.kitchenName = kitchenName;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(int priceRange) {
        this.priceRange = priceRange;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HoursOfOperation getHoursOfOperation() {
        return hoursOfOperation;
    }

    public void setHoursOfOperation(HoursOfOperation hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
