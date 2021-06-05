package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.repo.AutomatRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutomatManager {
    private AutomatRepo automatRepo;

    @Autowired
    public AutomatManager(AutomatRepo automatRepo) {
        this.automatRepo = automatRepo;
    }
}
