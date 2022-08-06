package com.reservaya.productmicroservice.repository;

import com.reservaya.productmicroservice.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository
        extends MongoRepository<ProductEntity, String> {}

