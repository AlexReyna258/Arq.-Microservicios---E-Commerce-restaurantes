package com.reservaya.restaurantmicroservice.controller;

import com.reservaya.restaurantmicroservice.entity.RestaurantEntity;
import com.reservaya.restaurantmicroservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/restaurant")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<RestaurantEntity> getAllRestaurants() {
        return restaurantService.getAll();
    }

    @GetMapping("/{idRestaurant}")
    @ResponseStatus(HttpStatus.OK)
    private RestaurantEntity getRestaurantById(@PathVariable("idRestaurant") String idRestaurant) {
        return restaurantService.getById(idRestaurant);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveRestaurant(@RequestBody RestaurantEntity restaurantEntity) {
        restaurantService.save(restaurantEntity);
    }

    @PutMapping
    public void updateRestaurantById(@RequestBody RestaurantEntity restaurantEntity) {
        restaurantService.updateById(restaurantEntity);
    }

    @DeleteMapping("/{idRestaurant}")
    public void deleteRestaurantById(@PathVariable("idRestaurant") String idRestaurant) {
        restaurantService.deleteById(idRestaurant);
    }
}
