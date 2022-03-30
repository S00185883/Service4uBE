package com.S00185883.service4u.Service;
import java.util.List;
import com.S00185883.service4u.model.Customer;
import org.springframework.stereotype.Service;

//defining the business logic
@Service
public interface CustomerService {

    // Save operation
    Customer saveCustomer(Customer customer);

    // Read operation
    List<Customer> fetchCustomerList();

    // Update operation
    Customer updateCustomer(Customer customer,
                            Long customerId);

    // Delete operation
    void deleteCustomerById(Long customerId);
}