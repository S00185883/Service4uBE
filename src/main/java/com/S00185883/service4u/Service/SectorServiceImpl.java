package com.S00185883.service4u.Service;// Java Program to Illustrate DepartmentServiceImpl.java
// File

// Importing required packages
// Importing required classes
import java.util.List;
import java.util.Objects;

import com.S00185883.service4u.Repository.SectorRepository;
import com.S00185883.service4u.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Annotation
@Service
// Class implementing DepartmentService class
public class SectorServiceImpl
        implements SectorService {

    @Autowired
    private SectorRepository sectorRepository;
    @Override
    public Sector saveSector(Sector sector) {
        return sectorRepository.save(sector);
    }
    @Override
    public List<Sector> fetchSectorList() {
        return (List<Sector>)
                sectorRepository.findAll();    }
    @Override
    public Sector updateSector(Sector sector, Long sectorId) {
        Sector depDB
                = sectorRepository.findById(sectorId)
                .get();

        if (Objects.nonNull(
                sector.getType())
                && !"".equalsIgnoreCase(
                sector.getType())) {
            depDB.setType(
                    sector.getType());
        }

        if (Objects.nonNull(
                sector.getDescription())
                && !"".equalsIgnoreCase(
                sector.getDescription())) {
            depDB.setDescription(
                    sector.getDescription());
        }

        return sectorRepository.save(depDB);
    }

    @Override
    public void deleteSectorById(Long sectorId) {
        sectorRepository.deleteById(sectorId);

    }
}
