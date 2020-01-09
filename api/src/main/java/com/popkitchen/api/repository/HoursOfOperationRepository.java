package com.popkitchen.api.repository;

import com.popkitchen.api.model.HoursOfOperation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HoursOfOperationRepository extends CrudRepository<HoursOfOperation, Long> {

}
