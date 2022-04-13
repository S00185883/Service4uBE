package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.ReviewService;
import com.S00185883.service4u.model.Review;
import com.S00185883.service4u.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class ReviewsController {

    @Autowired private ReviewService reviewService;

    // Save operation
    @PostMapping("/reviews")
    @CrossOrigin(origins = "http://localhost:3000")
    public Review saveReview(
            @Valid @RequestBody Review review)
    {
        return reviewService.saveReview(review);
    }

    // Read operation
    @GetMapping("/reviews")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Review> fetchReviewList()
    {
        return reviewService.fetchReviewList();
    }

    // Update operation
    @PutMapping("/reviews/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Review
    updateDepartment(@RequestBody Review review,
                     @PathVariable("id") Long reviewId)
    {
        return reviewService.updateReview(
                review, reviewId);
    }

    // Delete operation
    @DeleteMapping("/reviews/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public String deleteReviewById(@PathVariable("id")
                                             Long reviewId)
    {
        reviewService.deleteReviewById(
                reviewId);
        return "Deleted Successfully";
    }
    @GetMapping("/review/provider/{providerid}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Review> findByProviderid(@PathVariable("providerid") String providerid)
    {
        return reviewService.findByProviderid(providerid);

    }
    @GetMapping("/review/{customeremail}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Review> findByCustomer(@PathVariable("customeremail") String customeremail)
    {
        return reviewService.findByCustomer(customeremail);

    }
}
