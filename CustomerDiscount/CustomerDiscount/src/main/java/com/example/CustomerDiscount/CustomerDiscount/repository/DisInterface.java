package com.example.CustomerDiscount.CustomerDiscount.repository;

import com.example.CustomerDiscount.CustomerDiscount.entity.DiscountEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisInterface extends MongoRepository<DiscountEntity,Long> {
}
