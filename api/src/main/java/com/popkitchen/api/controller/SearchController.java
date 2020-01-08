package com.popkitchen.api.controller;

import com.popkitchen.api.dto.SearchDTO;
import com.popkitchen.api.model.SearchRequest;
import com.popkitchen.api.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

    @Autowired
    private SearchService service;

    @GetMapping("/search/foodtype")
    public ResponseEntity <SearchDTO> searchByFoodType(@RequestBody SearchRequest request){
        return service.searchByFoodType(request);
    }

    @GetMapping("/search/rating")
    public ResponseEntity <SearchDTO> searchByRating(@RequestBody SearchRequest request){
        return service.searchByRating(request);
    }

    @GetMapping("/search/price-point")
    public ResponseEntity <SearchDTO> searchByPricePoint(@RequestBody SearchRequest request){
        return service.searchByPricePoint(request);
    }

    @GetMapping("/search/kitchen-name")
    public ResponseEntity<SearchDTO> searchByKitchenName(@RequestBody SearchRequest request) {
        return service.searchByKitchenName(request);
    }

    @GetMapping("/search/location")
    public ResponseEntity<SearchDTO> searchByLocation(@RequestBody SearchRequest request) {
        return service.searchByLocation(request);
    }

    @GetMapping("/search/zipcode")
    public ResponseEntity<SearchDTO> searchByZipcode(@RequestBody SearchRequest request){
        return service.searchByZipcode(request);
    }
}
