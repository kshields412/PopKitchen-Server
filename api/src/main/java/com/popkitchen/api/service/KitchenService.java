package com.popkitchen.api.service;

import com.popkitchen.api.model.Kitchen;
import com.popkitchen.api.model.KitchenOwner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class KitchenService {

    @Autowired
    private KitchenService kitchenService;

    public ResponseEntity<Kitchen> createKitchen(Kitchen kitchen, KitchenOwner owner) {
        return createKitchen(kitchen, owner);
    }

}
