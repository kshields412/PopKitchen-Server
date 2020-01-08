package com.popkitchen.api.repository;

import com.popkitchen.api.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
