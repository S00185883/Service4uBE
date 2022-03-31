package com.S00185883.service4u.Service;

import com.S00185883.service4u.model.Booking;
import com.S00185883.service4u.model.Sector;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookingService {
    Booking saveBooking(Booking booking);
    // Read operation
    List<Booking> fetchBookingList();
    // Update operation
    Booking updateBooking(Booking booking,
                          Long bookingId);
    // Delete operation
    void deleteBookingById(Long bookingId);
}




