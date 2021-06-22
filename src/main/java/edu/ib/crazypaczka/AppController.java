package edu.ib.crazypaczka;

import edu.ib.crazypaczka.entity.Client;
import edu.ib.crazypaczka.entity.Shipment;
import edu.ib.crazypaczka.repo.ClientRepo;
import edu.ib.crazypaczka.repo.ShipmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private ClientRepo clientRepo;
    private ShipmentRepo shipmentRepo;

    @GetMapping("")
    public String viewHomePage() {
        return "index";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("user", new Client());
        return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegister(Client client) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(client.getPassword());
        client.setPassword(encodedPassword);

        clientRepo.save(client);

        return "register_success";
    }

    @GetMapping("/users")
    public String listUsers(Model model) {
        List<Client> listUsers = (List<Client>) clientRepo.findAll();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    @GetMapping("/package")
    public String getNewPackage(Model model) {
        model.addAttribute("package", new Shipment());
        return "newPackage";
    }

    @PostMapping("/package_register")
    public String package_register(Shipment shipment) {
        shipmentRepo.save(shipment);

        return "package_success";
    }
}
