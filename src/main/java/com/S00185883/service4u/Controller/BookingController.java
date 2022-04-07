package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;


import com.S00185883.service4u.Service.BookingService;
import com.S00185883.service4u.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class BookingController {
    @Autowired private BookingService bookingService;
    // Save operation
    @PostMapping("/bookings")
    @CrossOrigin(origins = "http://localhost:3000")
    public Booking saveBooking(
            @Valid @RequestBody Booking booking)
    {
        return bookingService.saveBooking(booking);
    }

    // Read operation
    @GetMapping("/bookings")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Booking> fetchBookingList()
    {
        return bookingService.fetchBookingList();
    }

    // Update operation
    @PutMapping("/bookings/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Booking
    updateDepartment(@RequestBody Booking booking,
                     @PathVariable("id") Long bookingId)
    {
        return bookingService.updateBooking(
                booking, bookingId);
    }

    // Delete operation
    @DeleteMapping("/bookings/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public String deleteBookingById(@PathVariable("id")
                                             Long bookingId)
    {
        bookingService.deleteBookingById(
                bookingId);
        return "Deleted Successfully";
    }
}
