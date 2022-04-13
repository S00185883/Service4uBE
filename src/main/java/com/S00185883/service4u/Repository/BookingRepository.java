package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Booking;
import com.S00185883.service4u.model.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository  extends JpaRepository<Booking, Long> {
    public List<Booking> findByCustomer(String customeremail);

}