package com.popkitchen.api.controller;

import com.popkitchen.api.model.Kitchen;
import com.popkitchen.api.model.KitchenOwner;
import com.popkitchen.api.service.KitchenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class KitchenController {
    @Autowired
    private KitchenService kitchenService;

    @PostMapping("/kitchen")
    public ResponseEntity<?> createKitchen(@RequestBody Kitchen kitchen){
        return kitchenService.createKitchen(kitchen);
    }

    @DeleteMapping("/kitchen")
    public ResponseEntity<?> deleteKitchen(@RequestBody Kitchen kitchen){
        return kitchenService.deleteKitchen(kitchen);
    }

    @PutMapping("/kitchen")
    public ResponseEntity<?> updateKitchen(@RequestBody Kitchen kitchen){
        return kitchenService.updateKitchen(kitchen);
    }

    @GetMapping("/kitchen")
    public ResponseEntity<?> getKitchen(@RequestBody Kitchen kitchen) {
        return kitchenService.getKitchen(kitchen);
    }
}
