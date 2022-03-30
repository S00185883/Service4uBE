package com.S00185883.service4u.Service;
import java.util.List;
import java.util.Objects;

import com.S00185883.service4u.Repository.ServiceRepository;
import com.S00185883.service4u.model.Provider;
import com.S00185883.service4u.model.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class ServiceServiceImpl
        implements ServiceService {
    @Autowired
    private ServiceRepository serviceRepository;
    @Override
    public Services saveServices(Services service) {
        return serviceRepository.save(service);
    }
    @Override
    public List<Services> fetchServicesList() {
        return (List<Services>)
                serviceRepository.findAll();    }
    @Override
    public Services updateServices(Services services, Long serviceId) {
        Services depDB
                = serviceRepository.findById(serviceId)
                .get();

        if (Objects.nonNull(
                services.getPrice())
                && !"".equalsIgnoreCase(
                String.valueOf(services.getPrice()))) {
            depDB.setPrice(
                    services.getPrice());
        }

        if (Objects.nonNull(
                services.getDescription())
                && !"".equalsIgnoreCase(
                services.getDescription())) {
            depDB.setDescription(
                    services.getDescription());
        }
        if (Objects.nonNull(
                services.getName())
                && !"".equalsIgnoreCase(
                services.getName())) {
            depDB.setName(
                    services.getName());
        }
        if (Objects.nonNull(services.getProviderid())
                && !"".equalsIgnoreCase(
                String.valueOf(services.getProviderid()))) {
            depDB.setProviderid(
                    services.getProviderid());
        }

        return serviceRepository.save(depDB);
    }

    @Override
    public void deleteServicesById(Long serviceId) {
        serviceRepository.deleteById(serviceId);

    }
}
