package edu.ib.crazypaczka.api;

import edu.ib.crazypaczka.entity.Shipment;
import edu.ib.crazypaczka.manager.ShipmentManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ShipmentAPI {

    private ShipmentManager shipments;

    @Autowired
    public ShipmentAPI(ShipmentManager shipments) {
        this.shipments = shipments;
    }

    //GET
    @GetMapping("/shipments/all")
    public Iterable<Shipment> getAll() {
        return shipments.findAllPackages();
    }

    @GetMapping("/shipments")
    public Optional<Shipment> getById(@RequestParam Long id) {
        return shipments.findByIdPackage(id);
    }

    //POST
    @PostMapping("/new/shipment")
    public Shipment addShipment(@RequestBody Shipment newShipment) {
        return shipments.savePackage(newShipment);
    }

    //PUT
    @PutMapping("/edit/shipment")
    public Shipment putShipment(@RequestBody Shipment newShipment, @RequestParam Long id) {
        return shipments.editShipment(newShipment, id);
    }
}
