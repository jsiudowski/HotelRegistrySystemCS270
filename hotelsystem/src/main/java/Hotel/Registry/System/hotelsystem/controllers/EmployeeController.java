package Hotel.Registry.System.hotelsystem.controllers;

import Hotel.Registry.System.hotelsystem.exception.EmployeeNotFoundException;
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

    @GetMapping("/employee/{id}")
    Employee getEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EmployeeNotFoundException(id));
    }


    @PutMapping("/employee/{id}")
    Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id){
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setEmployeeID(newEmployee.getEmployeeID());
                    employee.setEmployeeSSN(newEmployee.getEmployeeSSN());
                    employee.setEmployeePosition(newEmployee.getEmployeePosition());
                    employee.setEmployeeName(newEmployee.getName());
                    return employeeRepository.save(employee);
                })
                .orElseThrow(()-> new EmployeeNotFoundException(id));
    }


}
