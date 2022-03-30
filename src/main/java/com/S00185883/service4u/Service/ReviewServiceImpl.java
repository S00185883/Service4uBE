package com.S00185883.service4u.Service;
import java.util.List;
import java.util.Objects;

import com.S00185883.service4u.Repository.ReviewsRepository;
import com.S00185883.service4u.model.Provider;
import com.S00185883.service4u.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class ReviewServiceImpl
        implements ReviewService {

    @Autowired
    private ReviewsRepository reviewRepository;

    @Override
    public Review saveReview(Review review) {
        return reviewRepository.save(review);
    }

    @Override
    public List<Review> fetchReviewList() {
        return (List<Review>)
                reviewRepository.findAll();
    }

    @Override
    public Review updateReview(Review review, Long reviewId) {
        Review depDB
                = reviewRepository.findById(reviewId)
                .get();

        if (Objects.nonNull(
                review.getCustomerid())
                && !"".equalsIgnoreCase(
                String.valueOf(review.getCustomerid()))) {
            depDB.setCustomerid(
                    review.getCustomerid());
        }

        if (Objects.nonNull(
                review.getProviderid())
                && !"".equalsIgnoreCase(
                String.valueOf(review.getProviderid()))) {
            depDB.setProviderid(
                    review.getProviderid());
        }
        if (Objects.nonNull(
                review.getDate())
                && !"".equalsIgnoreCase(
                String.valueOf(review.getDate()))) {
            depDB.setDate(
                    review.getDate());
        }
        if (Objects.nonNull(review.getRating())
                && !"".equalsIgnoreCase(
                String.valueOf(review.getRating()))) {
            depDB.setRating(
                    review.getRating());
        }
        if (Objects.nonNull(review.getReview())
                && !"".equalsIgnoreCase(
                review.getReview())) {
            depDB.setReview(
                    review.getReview());
        }

        return reviewRepository.save(depDB);
    }

    @Override
    public void deleteReviewById(Long providerId) {
        reviewRepository.deleteById(providerId);

    }
}
