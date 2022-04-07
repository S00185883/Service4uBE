package com.S00185883.service4u.Service;// Java Program to Illustrate DepartmentServiceImpl.java
// File

// Importing required packages
// Importing required classes
import java.util.List;
import java.util.Objects;

import com.S00185883.service4u.Repository.ProvidersRepository;
import com.S00185883.service4u.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class ProviderServiceImpl
        implements ProvidersService {

    @Autowired
    private ProvidersRepository providersRepository;
    @Override
    public Provider saveProvider(Provider provider) {
        return providersRepository.save(provider);
    }
    @Override
    public List<Provider> fetchProviderList() {
        return (List<Provider>)
                providersRepository.findAll();    }
    @Override
    public Provider updateProvider(Provider provider, Long providerId) {
        Provider depDB
                = providersRepository.findById(providerId)
                .get();

        if (Objects.nonNull(
                provider.getName())
                && !"".equalsIgnoreCase(
                provider.getName())) {
            depDB.setName(
                    provider.getName());
        }

        if (Objects.nonNull(
                provider.getAddressLineOne())
                && !"".equalsIgnoreCase(
                provider.getAddressLineOne())) {
            depDB.setAddressLineOne(
                    provider.getAddressLineOne());
        }
        if (Objects.nonNull(
                provider.getAddressLineTwo())
                && !"".equalsIgnoreCase(
                provider.getAddressLineTwo())) {
            depDB.setAddressLineTwo(
                    provider.getAddressLineTwo());
        }
        if (Objects.nonNull(provider.getTown())
                && !"".equalsIgnoreCase(
                provider.getTown())) {
            depDB.setTown(
                    provider.getTown());
        }
        if (Objects.nonNull(provider.getCounty())
                && !"".equalsIgnoreCase(
                provider.getCounty())) {
            depDB.setCounty(
                    provider.getCounty());
        }
        if (Objects.nonNull(provider.getEircode())
                && !"".equalsIgnoreCase(
                provider.getEircode())) {
            depDB.setEircode(
                    provider.getEircode());
        }
        if (Objects.nonNull(provider.getSector())
                && !"".equalsIgnoreCase(
                String.valueOf(provider.getSector()))) {
            depDB.setSector(
                    provider.getSector());
        }
        return providersRepository.save(depDB);
    }

    @Override
    public void deleteProviderById(Long providerId) {
        providersRepository.deleteById(providerId);

    }
    public List<Provider> findByCounty(String county) {
        return (List<Provider>)
                providersRepository.findByCounty(county);    }
    public List<Provider> findBySector(Integer sector) {
        return (List<Provider>)
                providersRepository.findBySector(sector);    }

}
