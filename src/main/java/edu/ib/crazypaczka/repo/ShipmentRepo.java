package edu.ib.crazypaczka.repo;

import edu.ib.crazypaczka.entity.Shipment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentRepo extends CrudRepository<Shipment, Long> {
}
