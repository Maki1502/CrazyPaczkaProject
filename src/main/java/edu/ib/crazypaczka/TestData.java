/*package edu.ib.crazypaczka;

import edu.ib.crazypaczka.entity.Client;
import edu.ib.crazypaczka.repo.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class TestData {
    private ClientRepo clientRepo;

    @Autowired
    public TestData(ClientRepo clientRepo){
        this.clientRepo = clientRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        Client client1 = new Client("Jan","Nowak","Wroclaw","mail@test.com","123123123","123");
        clientRepo.save(client1);

    }
}*/
