package com.S00185883.service4u.Service;
import java.util.ArrayList;
import java.util.List;

import com.S00185883.service4u.Repository.ProvidersRepository;
import com.S00185883.service4u.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//defining the business logic
@Service
public interface ProvidersService {

    // Save operation
    Provider saveProvider(Provider provider);

    // Read operation
    List<Provider> fetchProviderList();

    // Update operation
    Provider updateProvider(Provider provider,
                                Long providerId);
    // Delete operation
    void deleteProviderById(Long providerId);
}