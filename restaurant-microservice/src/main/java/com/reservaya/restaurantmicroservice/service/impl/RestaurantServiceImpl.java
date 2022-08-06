package com.reservaya.restaurantmicroservice.service.impl;

import com.reservaya.restaurantmicroservice.entity.RestaurantEntity;
import com.reservaya.restaurantmicroservice.repository.RestaurantRepository;
import com.reservaya.restaurantmicroservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public List<RestaurantEntity> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public RestaurantEntity getById(String idRestaurant) {
        return restaurantRepository.findById(idRestaurant).orElse(null);
    }

    @Override
    public void save(RestaurantEntity restaurantEntity) {
        restaurantRepository.save(restaurantEntity);
    }

    @Override
    public void updateById(RestaurantEntity restaurantEntity) {
        restaurantRepository.save(restaurantEntity);
    }

    @Override
    public void deleteById(String idRestaurant) {
        restaurantRepository.deleteById(idRestaurant);
    }
}
