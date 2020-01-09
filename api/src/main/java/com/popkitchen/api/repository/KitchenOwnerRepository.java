package com.popkitchen.api.repository;

import com.popkitchen.api.model.KitchenOwner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KitchenOwnerRepository extends CrudRepository<KitchenOwner, Long> {
}
