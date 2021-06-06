package edu.ib.crazypaczka.manager;

import edu.ib.crazypaczka.entity.Client;
import edu.ib.crazypaczka.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientManager {
    private ClientRepo clientRepo;

    @Autowired
    public ClientManager(ClientRepo clientRepo) {
        this.clientRepo = clientRepo;
    }

    //GET
    public Optional<Client> findByIdClient(Long id) {
        return clientRepo.findById(id);
    }

    public Iterable<Client> findAllClients() {
        return clientRepo.findAll();
    }

    //POST
    public Client saveClient(Client client) {
        return clientRepo.save(client);
    }

    //PUT
    public Client editClient(Client newClient, Long id) {
        return clientRepo.findById(id)
                .map(client -> {
                    client.setAddress(newClient.getAddress());
                    client.setEmail(newClient.getEmail());
                    client.setName(newClient.getName());
                    client.setNumber(newClient.getNumber());
                    client.setPassword(newClient.getPassword());
                    client.setSurname(newClient.getSurname());
                    return clientRepo.save(client);
                })
                .orElseGet(() -> {
                    newClient.setId(id);
                    return clientRepo.save(newClient);
                });
    }
}
