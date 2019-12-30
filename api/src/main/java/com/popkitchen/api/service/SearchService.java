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
}
