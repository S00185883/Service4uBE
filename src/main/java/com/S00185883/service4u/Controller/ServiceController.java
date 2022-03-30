package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.ServiceService;
import com.S00185883.service4u.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class ServiceController {

    @Autowired private ServiceService serviceService;

    // Save operation
    @PostMapping("/services")

    public Services saveServices(
            @Valid @RequestBody Services service)
    {
        return serviceService.saveServices(service);
    }

    // Read operation
    @GetMapping("/services")

    public List<Services> fetchServicesList()
    {
        return serviceService.fetchServicesList();
    }

    // Update operation
    @PutMapping("/services/{id}")

    public Services
    updateDepartment(@RequestBody Services service,
                     @PathVariable("id") Long serviceId)
    {
        return serviceService.updateServices(
                service, serviceId);
    }

    // Delete operation
    @DeleteMapping("/services/{id}")

    public String deleteServicesById(@PathVariable("id")
                                           Long serviceId)
    {
        serviceService.deleteServicesById(
                serviceId);
        return "Deleted Successfully";
    }
}
