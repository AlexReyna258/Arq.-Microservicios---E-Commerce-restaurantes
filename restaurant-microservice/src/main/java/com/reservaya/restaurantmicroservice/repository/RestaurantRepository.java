package com.reservaya.restaurantmicroservice.repository;

import com.reservaya.restaurantmicroservice.entity.RestaurantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<RestaurantEntity,String> {
}
