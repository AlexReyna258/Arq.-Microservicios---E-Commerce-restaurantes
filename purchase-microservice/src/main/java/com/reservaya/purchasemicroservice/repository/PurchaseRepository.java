package com.reservaya.purchasemicroservice.repository;

import com.reservaya.purchasemicroservice.entity.PurchaseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PurchaseRepository extends MongoRepository<PurchaseEntity, String> {
}
