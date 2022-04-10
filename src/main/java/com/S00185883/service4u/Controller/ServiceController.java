package com.S00185883.service4u.Controller;

import java.util.List;
import java.util.Optional;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.ServiceService;
import com.S00185883.service4u.model.Provider;
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
    @CrossOrigin(origins = "http://localhost:3000")
    public Services saveServices(
            @Valid @RequestBody Services service)
    {
        return serviceService.saveServices(service);
    }

    // Read operation
    @GetMapping("/services")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Services> fetchServicesList()
    {
        return serviceService.fetchServicesList();
    }

    // Update operation
    @PutMapping("/services/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Services
    updateDepartment(@RequestBody Services service,
                     @PathVariable("id") Long serviceId)
    {
        return serviceService.updateServices(
                service, serviceId);
    }

    // Delete operation
    @DeleteMapping("/services/{id}")
    @CrossOrigin(origins = "http://localhost:3000")
    public String deleteServicesById(@PathVariable("id")
                                           Long serviceId)
    {
        serviceService.deleteServicesById(
                serviceId);
        return "Deleted Successfully";
    }
    @GetMapping("/services/provider/{providerid}")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Services> findByProviderid(@PathVariable("providerid") Long providerid)
    {
        return serviceService.findByProviderid(providerid);

    }
    @GetMapping("/service/{serviceId}")
    @CrossOrigin(origins = "http://localhost:3000")
    public Optional<Services> findById(@PathVariable("serviceId") Long serviceId)
    {
        return serviceService.findById(serviceId);

    }
}
