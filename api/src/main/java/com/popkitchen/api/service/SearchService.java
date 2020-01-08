package com.popkitchen.api.service;

import com.popkitchen.api.dto.SearchDTO;
import com.popkitchen.api.model.SearchRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public ResponseEntity<SearchDTO> searchByFoodType(SearchRequest request) {
        return searchByFoodType(request);
    }

    public ResponseEntity<SearchDTO> searchByRating(SearchRequest request) {
        return searchByRating(request);
    }

    public ResponseEntity<SearchDTO> searchByPricePoint (SearchRequest request) {
        return searchByPricePoint(request);
    }

    public ResponseEntity<SearchDTO> searchByKitchenName (SearchRequest request) {
        return searchByKitchenName(request);
    }

    public ResponseEntity<SearchDTO> searchByLocation (SearchRequest request){
        return searchByLocation(request);
    }

    public ResponseEntity<SearchDTO> searchByZipcode (SearchRequest request){
        return searchByZipcode(request);
    }
}
