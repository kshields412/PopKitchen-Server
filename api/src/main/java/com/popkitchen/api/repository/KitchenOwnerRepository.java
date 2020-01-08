package com.popkitchen.api.repository;

import com.popkitchen.api.model.KitchenOwner;
import org.springframework.data.repository.CrudRepository;

public interface KitchenOwnerRepository extends CrudRepository<KitchenOwner, Long> {
}
