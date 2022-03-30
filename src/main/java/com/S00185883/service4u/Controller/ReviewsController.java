package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.ReviewService;
import com.S00185883.service4u.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class ReviewsController {

    @Autowired private ReviewService reviewService;

    // Save operation
    @PostMapping("/reviews")

    public Review saveReview(
            @Valid @RequestBody Review review)
    {
        return reviewService.saveReview(review);
    }

    // Read operation
    @GetMapping("/reviews")

    public List<Review> fetchReviewList()
    {
        return reviewService.fetchReviewList();
    }

    // Update operation
    @PutMapping("/reviews/{id}")

    public Review
    updateDepartment(@RequestBody Review review,
                     @PathVariable("id") Long reviewId)
    {
        return reviewService.updateReview(
                review, reviewId);
    }

    // Delete operation
    @DeleteMapping("/reviews/{id}")

    public String deleteReviewById(@PathVariable("id")
                                             Long reviewId)
    {
        reviewService.deleteReviewById(
                reviewId);
        return "Deleted Successfully";
    }
}
