package com.S00185883.service4u.Repository;
import com.S00185883.service4u.model.Provider;
import com.S00185883.service4u.model.Sector;
import org.springframework.data.repository.CrudRepository;
//repository that extends CrudRepository
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvidersRepository  extends CrudRepository<Provider, Long> {

}