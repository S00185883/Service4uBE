package com.S00185883.service4u.Controller;

import java.util.List;
// Importing required classes
import javax.validation.Valid;

import com.S00185883.service4u.Service.SectorService;
import com.S00185883.service4u.model.Sector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Annotation
@RestController
// Class
public class SectorController {

    @Autowired private SectorService sectorService;

    // Save operation
    @PostMapping("/sectors")
    @CrossOrigin(origins = "https://service4u.netlify.app")
    public Sector saveSector(
            @Valid @RequestBody Sector sector)
    {
        return sectorService.saveSector(sector);
    }

    // Read operation
    @GetMapping("/sectors")
    @CrossOrigin(origins = "https://service4u.netlify.app")
    public List<Sector> fetchSectorList()
    {
        return sectorService.fetchSectorList();
    }

    // Update operation
    @PutMapping("/sectors/{id}")
    @CrossOrigin(origins = "https://service4u.netlify.app")
    public Sector
    updateDepartment(@RequestBody Sector sector,
                     @PathVariable("id") Long sectorId)
    {
        return sectorService.updateSector(
                sector, sectorId);
    }

    // Delete operation
    @DeleteMapping("/sectors/{id}")
    @CrossOrigin(origins = "https://service4u.netlify.app")
    public String deleteSectorById(@PathVariable("id")
                                             Long sectorId)
    {
        sectorService.deleteSectorById(
                sectorId);
        return "Deleted Successfully";
    }
}
