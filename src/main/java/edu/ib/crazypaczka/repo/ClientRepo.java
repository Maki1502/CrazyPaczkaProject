package edu.ib.crazypaczka.repo;

import edu.ib.crazypaczka.entity.Client;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<Client, Long> {
    @Query("SELECT u FROM Client u WHERE u.email = ?1")
    public Client findByEmail(String email);
}
