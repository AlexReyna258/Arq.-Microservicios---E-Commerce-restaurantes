package com.reservaya.bookingmicroservice.service;

import com.reservaya.bookingmicroservice.entity.BookingEntity;

import java.util.List;

public interface BookingService {

    public List<BookingEntity> getAll();

    public BookingEntity getById(String idBooking);

    public void save(BookingEntity bookingEntity);

    public void updateById(BookingEntity bookingEntity);

    public void deleteById(String idBooking);
}
