package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientManager {
    private ClientRepo clientRepo;

    @Autowired
    public ClientManager(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }
}
