package com.reservaya.bookingmicroservice.repository;

import com.reservaya.bookingmicroservice.entity.BookingEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookingRepository extends MongoRepository<BookingEntity,String> {
}
