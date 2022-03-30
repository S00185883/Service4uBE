package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.ProvidersService;
import com.S00185883.service4u.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class ProvidersController {

    @Autowired private ProvidersService providersService;

    // Save operation
    @PostMapping("/providers")

    public Provider saveProvider(
            @Valid @RequestBody Provider provider)
    {
        return providersService.saveProvider(provider);
    }

    // Read operation
    @GetMapping("/providers")

    public List<Provider> fetchProviderList()
    {
        return providersService.fetchProviderList();
    }

    // Update operation
    @PutMapping("/providers/{id}")

    public Provider
    updateDepartment(@RequestBody Provider provider,
                     @PathVariable("id") Long providerId)
    {
        return providersService.updateProvider(
                provider, providerId);
    }

    // Delete operation
    @DeleteMapping("/providers/{id}")

    public String deleteProviderById(@PathVariable("id")
                                               Long providerId)
    {
        providersService.deleteProviderById(
                providerId);
        return "Deleted Successfully";
    }
}
