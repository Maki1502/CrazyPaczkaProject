package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.entity.Automat;
import edu.ib.crazypaczka.repo.AutomatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutomatManager {
    private AutomatRepo automatRepo;

    @Autowired
    public AutomatManager(AutomatRepo automatRepo) {
        this.automatRepo = automatRepo;
    }

    //GET
    public Optional<Automat> findByIdAutomat(Long id) {
        return automatRepo.findById(id);
    }

    public Iterable<Automat> findAllAutomats() {
        return automatRepo.findAll();
    }

    //POST
    public Automat saveAutomat(Automat automat) {
        return automatRepo.save(automat);
    }

    //PUT
    public Automat editAutomat(Automat newAutomat, Long id) {
        return automatRepo.findById(id)
                .map(automat -> {
                    automat.setAddress(newAutomat.getAddress());
                    automat.setL_locker(newAutomat.getL_locker());
                    automat.setM_locker(newAutomat.getM_locker());
                    automat.setS_locker(newAutomat.getS_locker());
                    return automatRepo.save(automat);
                })
                .orElseGet(() -> {
                    newAutomat.setId(id);
                    return automatRepo.save(newAutomat);
                });
    }
}
