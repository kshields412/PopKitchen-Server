package com.popkitchen.api.repository;

import com.popkitchen.api.model.Kitchen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenRepository extends CrudRepository<Kitchen, Long> {
}
