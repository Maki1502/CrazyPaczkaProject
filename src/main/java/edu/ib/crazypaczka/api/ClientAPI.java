package edu.ib.crazypaczka.api;

import edu.ib.crazypaczka.entity.Client;
import edu.ib.crazypaczka.manager.ClientManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ClientAPI {

    private ClientManager clients;

    @Autowired
    public ClientAPI(ClientManager clients) {
        this.clients = clients;
    }

    //GET
    @GetMapping("/clients/all")
    public Iterable<Client> getAll() {
        return clients.findAllClients();
    }

    @GetMapping("/clients")
    public Optional<Client> getById(@RequestParam Long id) {
        return clients.findByIdClient(id);
    }

    //POST
    @PostMapping("/new/client")
    public Client addClient(@RequestBody Client newClient) {
        return clients.saveClient(newClient);
    }

    //PUT
    @PutMapping("/edit/client")
    public Client putClient(@RequestBody Client newClient, @RequestParam Long id) {
        return clients.editClient(newClient, id);
    }
}
