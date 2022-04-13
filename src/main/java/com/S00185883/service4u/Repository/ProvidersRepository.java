package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Provider;
//repository that extends CrudRepository
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvidersRepository  extends JpaRepository<Provider, Long> {
    public List<Provider> findByCounty(String county);
    public List<Provider> findBySector(String sector);
    public List<Provider> findByCountyAndSector(String county,String sector);

}