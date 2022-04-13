package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Review;
import com.S00185883.service4u.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewsRepository  extends JpaRepository<Review, Long> {
    public List<Review> findByProviderid(Long providerid);
    public List<Review> findByCustomer(String customeremail);

}