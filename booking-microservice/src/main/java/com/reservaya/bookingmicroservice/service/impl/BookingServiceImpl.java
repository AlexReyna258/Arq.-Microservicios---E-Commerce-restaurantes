package com.reservaya.bookingmicroservice.service.impl;

import com.reservaya.bookingmicroservice.entity.BookingEntity;
import com.reservaya.bookingmicroservice.repository.BookingRepository;
import com.reservaya.bookingmicroservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<BookingEntity> getAll() {
        return bookingRepository.findAll();
    }

    @Override
    public BookingEntity getById(String idBooking) {
        return bookingRepository.findById(idBooking).orElse(null);
    }

    @Override
    public void save(BookingEntity bookingEntity) {
        bookingRepository.save(bookingEntity);
    }

    @Override
    public void updateById(BookingEntity bookingEntity) {
        bookingRepository.save(bookingEntity);
    }

    @Override
    public void deleteById(String idBooking) {
        bookingRepository.deleteById(idBooking);
    }
}
