package com.S00185883.service4u.Service;
import java.util.List;


import com.S00185883.service4u.model.Review;
import org.springframework.stereotype.Service;

//defining the business logic
@Service
public interface ReviewService {

    // Save operation
    Review saveReview(Review review);

    // Read operation
    List<Review> fetchReviewList();

    // Update operation
    Review updateReview(Review review,
                            Long reviewId);

    // Delete operation
    void deleteReviewById(Long reviewId);
     List<Review> findByProviderid(long providerid);
     List<Review> findByCustomer(String customeremail);
}