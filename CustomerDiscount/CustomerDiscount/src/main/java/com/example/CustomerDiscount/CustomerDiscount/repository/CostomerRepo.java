package com.example.CustomerDiscount.CustomerDiscount.repository;

import com.example.CustomerDiscount.CustomerDiscount.entity.CostomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CostomerRepo extends MongoRepository<CostomerEntity,Long> {
}
