package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.entity.Shipment;
import edu.ib.crazypaczka.repo.ShipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShipmentManager {
    private ShipmentRepo shipmentRepo;

    @Autowired
    public ShipmentManager(ShipmentRepo shipmentRepo) {
        this.shipmentRepo = shipmentRepo;
    }

    //GET
    public Optional<Shipment> findByIdPackage(Long id) {
        return shipmentRepo.findById(id);
    }

    public Iterable<Shipment> findAllPackages() {
        return shipmentRepo.findAll();
    }

    //POST
    public Shipment savePackage(Shipment shipment) {
        return shipmentRepo.save(shipment);
    }

    //PUT
    public Shipment editShipment(Shipment newShipment, Long id) {
        return shipmentRepo.findById(id)
                .map(shipment -> {
                    shipment.setClient_id(newShipment.getClient_id());
                    shipment.setCons_date(newShipment.getCons_date());
                    shipment.setCons_place(newShipment.getCons_place());
                    shipment.setDel_date(newShipment.getDel_date());
                    shipment.setPrice(newShipment.getPrice());
                    shipment.setRec_place(newShipment.getRec_place());
                    shipment.setRecept_date(newShipment.getRecept_date());
                    shipment.setRecip_id(newShipment.getRecip_id());
                    return shipmentRepo.save(shipment);
                })
                .orElseGet(() -> {
                    newShipment.setId(id);
                    return shipmentRepo.save(newShipment);
                });
    }
}
