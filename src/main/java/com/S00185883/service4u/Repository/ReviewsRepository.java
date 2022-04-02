package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Review;
import com.S00185883.service4u.model.Sector;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository  extends JpaRepository<Review, Long> {

}