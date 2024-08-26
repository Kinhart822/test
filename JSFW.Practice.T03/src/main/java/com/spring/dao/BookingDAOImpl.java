package com.spring.dao;

import com.spring.entities.Booking;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookingDAOImpl implements BookingDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Booking create(Booking booking) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.save(booking);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return booking;
    }

    @Override
    public Booking update(Booking booking) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Booking bookingDB = session.find(Booking.class, booking.getId());
            if (bookingDB != null) {
                session.merge(booking);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return booking;
    }

    @Override
    public Booking delete(Booking booking) {
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            Booking bookingDB = session.find(Booking.class, booking.getId());
            if (bookingDB != null) {
                session.remove(bookingDB);
            }
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return booking;
    }

    @Override
    public Booking readOne(Integer id) {
        Booking booking = null;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            booking = session.find(Booking.class, id);
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return booking;
    }

    @Override
    public List<Booking> readAll() {
        List<Booking> bookings = null;
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            bookings = session.createQuery("from Booking", Booking.class).list();
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return bookings;
    }
}
