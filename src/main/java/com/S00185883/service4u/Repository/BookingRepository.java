package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository  extends JpaRepository<Booking, Long> {

}