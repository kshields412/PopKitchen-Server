package com.popkitchen.api.controller;

import com.popkitchen.api.model.Kitchen;
import com.popkitchen.api.model.KitchenOwner;
import com.popkitchen.api.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KitchenController {
    @Autowired
    private KitchenService kitchenService;

    @GetMapping("/kitchen")
    public ResponseEntity<Kitchen> createKitchen(@RequestBody Kitchen kitchen, KitchenOwner owner){
        return kitchenService.createKitchen(kitchen, owner);
    }

//    @DeleteMapping("/kitchen")
//    public ResponseEntity<Kitchen> deleteKitchen

}
