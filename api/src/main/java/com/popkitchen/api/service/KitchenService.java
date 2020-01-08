package com.popkitchen.api.service;

import com.popkitchen.api.model.Kitchen;
import com.popkitchen.api.model.KitchenOwner;
import org.springframework.http.ResponseEntity;

public class KitchenService {

    public ResponseEntity<Kitchen> createKitchen(Kitchen kitchen , KitchenOwner owner) {
        return createKitchen(kitchen, owner);
    }

}
