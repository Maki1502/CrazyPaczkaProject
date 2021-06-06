package edu.ib.crazypaczka.api;

import edu.ib.crazypaczka.entity.Automat;
import edu.ib.crazypaczka.manager.AutomatManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AutomatAPI {
    private AutomatManager automats;

    @Autowired
    public AutomatAPI(AutomatManager automats) {
        this.automats = automats;
    }

    //GET
    @GetMapping("/automats/all")
    public Iterable<Automat> getAll() {
        return automats.findAllAutomats();
    }

    @GetMapping("/automats")
    public Optional<Automat> getById(@RequestParam Long id) {
        return automats.findByIdAutomat(id);
    }

    //POST
    @PostMapping("/new/automat")
    public Automat addAutomat(@RequestBody Automat newAutomat) {
        return automats.saveAutomat(newAutomat);
    }

    //PUT
    @PutMapping("/edit/automat")
    public Automat putAutomat(@RequestBody Automat newAutomat, @RequestParam Long id) {
        return automats.editAutomat(newAutomat, id);
    }
}
