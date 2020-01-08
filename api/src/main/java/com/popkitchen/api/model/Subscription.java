package com.popkitchen.api.model;

import javax.persistence.Entity;

@Entity
public class Subscription {
    private Kitchen kitchen;
    private User user;

    public Subscription(Kitchen kitchen, User user) {
        this.kitchen = kitchen;
        this.user = user;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
