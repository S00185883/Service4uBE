package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Provider;
import com.S00185883.service4u.model.Services;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository  extends JpaRepository<Services, Long> {
    public List<Services> findByProviderid(Long providerid);

}