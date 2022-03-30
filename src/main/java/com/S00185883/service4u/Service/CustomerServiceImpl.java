package com.S00185883.service4u.Service;

import java.util.List;
import java.util.Objects;
import com.S00185883.service4u.Repository.CustomerRepository;
import com.S00185883.service4u.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class CustomerServiceImpl
        implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
    @Override
    public List<Customer> fetchCustomerList() {
        return (List<Customer>)
                customerRepository.findAll();    }
    @Override
    public Customer updateCustomer(Customer customer, Long customerId) {
        Customer depDB
                = customerRepository.findById(customerId)
                .get();

        if (Objects.nonNull(
                customer.getName())
                && !"".equalsIgnoreCase(
                customer.getName())) {
            depDB.setName(
                    customer.getName());
        }

        if (Objects.nonNull(
                customer.getLocation())
                && !"".equalsIgnoreCase(
                customer.getLocation())) {
            depDB.setLocation(
                    customer.getLocation());
        }



        return customerRepository.save(depDB);
    }

    @Override
    public void deleteCustomerById(Long customerId) {
        customerRepository.deleteById(customerId);

    }
}
