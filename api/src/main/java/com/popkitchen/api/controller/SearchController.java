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


}
