package com.reservaya.restaurantmicroservice.service;

import com.reservaya.restaurantmicroservice.entity.RestaurantEntity;

import java.util.List;

public interface RestaurantService {
    public List<RestaurantEntity> getAll();

    public RestaurantEntity getById(String idRestaurant);

    public void save(RestaurantEntity restaurantEntity);

    public void updateById(RestaurantEntity restaurantEntity);

    public void deleteById(String idRestaurant);
}
