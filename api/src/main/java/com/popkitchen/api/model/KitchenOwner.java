package com.popkitchen.api.model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class KitchenOwner extends User {
    private Kitchen kitchen;

    public KitchenOwner(String firstName, String lastName, String username, String email, String password, Date dateOfBirth, String phoneNumber) {
        super(firstName, lastName, username, email, password, dateOfBirth, phoneNumber);
    }

    public KitchenOwner(String firstName, String lastName, String username, String email, String password, Date dateOfBirth, String phoneNumber, Kitchen kitchen) {
        super(firstName, lastName, username, email, password, dateOfBirth, phoneNumber);
        this.kitchen = kitchen;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }
}
