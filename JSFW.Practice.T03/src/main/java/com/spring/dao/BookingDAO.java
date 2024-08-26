package com.spring.dao;

import com.spring.entities.Booking;

import java.util.List;

public interface BookingDAO {
    Booking create(Booking booking);

    Booking update(Booking booking);

    Booking delete(Booking booking);

    Booking readOne(Integer id);

    List<Booking> readAll();

}
