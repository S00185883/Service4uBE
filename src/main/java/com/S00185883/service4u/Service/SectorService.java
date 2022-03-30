package com.S00185883.service4u.Service;
import java.util.List;

import com.S00185883.service4u.model.Sector;
import org.springframework.stereotype.Service;

//defining the business logic
@Service
public interface SectorService {
    // Save operation
    Sector saveSector(Sector sector);

    // Read operation
    List<Sector> fetchSectorList();

    // Update operation
    Sector updateSector(Sector sector,
                            Long sectorId);

    // Delete operation
    void deleteSectorById(Long sectorId);
}
