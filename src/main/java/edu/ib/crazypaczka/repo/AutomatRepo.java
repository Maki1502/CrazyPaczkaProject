package edu.ib.crazypaczka.repo;

import edu.ib.crazypaczka.entity.Automat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomatRepo extends CrudRepository<Automat, Long> {
}
