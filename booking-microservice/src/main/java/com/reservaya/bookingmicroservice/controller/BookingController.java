package com.reservaya.bookingmicroservice.controller;

import com.reservaya.bookingmicroservice.entity.BookingEntity;
import com.reservaya.bookingmicroservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {
    @Autowired
    private BookingService bookingService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<BookingEntity> getAllBookings() {
        return bookingService.getAll();
    }

    @GetMapping("/{idBooking}")
    @ResponseStatus(HttpStatus.OK)
    private BookingEntity getBookingById(@PathVariable("idBooking") String idBooking) {
        return bookingService.getById(idBooking);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void saveBooking(@RequestBody BookingEntity bookingEntity) {
        bookingService.save(bookingEntity);
    }

    @PutMapping
    public void updateBookingById(@RequestBody BookingEntity bookingEntity) {
        bookingService.updateById(bookingEntity);
    }

    @DeleteMapping("/{idBooking}")
    public void deleteBookingById(@PathVariable("idBooking") String idBooking) {
        bookingService.deleteById(idBooking);
    }
}
