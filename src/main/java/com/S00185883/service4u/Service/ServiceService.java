package com.S00185883.service4u.Service;
import java.util.List;

import com.S00185883.service4u.model.Services;
import org.springframework.stereotype.Service;

//defining the business logic
@Service
public interface ServiceService {

    // Save operation
    Services saveServices(Services services);

    // Read operation
    List<Services> fetchServicesList();

    // Update operation
    Services updateServices(Services services,
                            Long serviceId);

    // Delete operation
    void deleteServicesById(Long serviceId);
}