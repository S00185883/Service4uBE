package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.CustomerService;
import com.S00185883.service4u.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class CustomerController {

    @Autowired private CustomerService customerService;

    // Save operation
    @PostMapping("/customers")

    public Customer saveCustomer(
            @Valid @RequestBody Customer customer)
    {
        return customerService.saveCustomer(customer);
    }

    // Read operation
    @GetMapping("/customers")

    public List<Customer> fetchCustomerList()
    {
        return customerService.fetchCustomerList();
    }

    // Update operation
    @PutMapping("/customers/{id}")

    public Customer
    updateDepartment(@RequestBody Customer customer,
                     @PathVariable("id") Long customerId)
    {
        return customerService.updateCustomer(
                customer, customerId);
    }

    // Delete operation
    @DeleteMapping("/customers/{id}")

    public String deleteCustomerById(@PathVariable("id")
                                             Long customerId)
    {
        customerService.deleteCustomerById(
                customerId);
        return "Deleted Successfully";
    }
}