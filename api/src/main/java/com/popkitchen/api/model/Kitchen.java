package com.popkitchen.api.model;

import com.popkitchen.api.enums.FoodType;
import com.popkitchen.api.enums.PriceRange;
import com.popkitchen.api.enums.Rating;

import javax.persistence.Entity;

@Entity
public class Kitchen {
    private Long id;
    private String kitchenName;
    private FoodType foodType;
    private Rating rating;
    private PriceRange priceRange;
    private String location;
    private int zipcode;
    private String description;
    private HoursOfOperation hoursOfOperation;
    private String phoneNumber;

    public Kitchen(String kitchenName, FoodType foodType, Rating rating, PriceRange priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation, String phoneNumber) {
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
    public Kitchen(String kitchenName, FoodType foodType, PriceRange priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation, String phoneNumber) {
        this.kitchenName = kitchenName;
        this.foodType = foodType;
        this.priceRange = priceRange;
        this.location = location;
        this.zipcode = zipcode;
        this.description = description;
        this.hoursOfOperation = hoursOfOperation;
        this.phoneNumber = phoneNumber;
    }

    public Kitchen(String kitchenName, FoodType foodType, Rating rating, PriceRange priceRange, String location, int zipcode, String description, HoursOfOperation hoursOfOperation) {
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

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public PriceRange getPriceRange() {
        return priceRange;
    }

    public void setPriceRange(PriceRange priceRange) {
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
