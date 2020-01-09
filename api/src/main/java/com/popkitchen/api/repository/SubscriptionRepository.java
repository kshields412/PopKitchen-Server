package com.popkitchen.api.repository;

import com.popkitchen.api.model.Subscription;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {
}
