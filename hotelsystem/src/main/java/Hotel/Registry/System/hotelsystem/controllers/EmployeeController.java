package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.models.Employee;
import Hotel.Registry.System.hotelsystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
@CrossOrigin("http://localhost:3000")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employee")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @GetMapping("/employees")
    List<Employee> getAllEmployees() {return employeeRepository.findAll();}
}
