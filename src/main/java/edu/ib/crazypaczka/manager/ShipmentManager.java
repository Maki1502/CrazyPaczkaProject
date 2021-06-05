package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.repo.ShipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShipmentManager {
    private ShipmentRepo shipmentRepo;

    @Autowired
    public ShipmentManager(ShipmentRepo shipmentRepo) {
        this.shipmentRepo = shipmentRepo;
    }
}
