package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.models.Customer;
import Hotel.Registry.System.hotelsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Indicates that this class is a controller class
@RestController
public class CustomerController {

    //Autowired annotation injects a designated class as a dependency
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/customer")
    Customer newCustomer(@RequestBody Customer newCustomer) {
        return customerRepository.save(newCustomer);
    }

    @GetMapping("/customers")
    List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

}
