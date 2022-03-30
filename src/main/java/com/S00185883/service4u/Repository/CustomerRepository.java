package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Customer;
import com.S00185883.service4u.model.Sector;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}