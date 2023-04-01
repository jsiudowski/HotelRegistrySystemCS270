package Hotel.Registry.System.hotelsystem.repository;

import Hotel.Registry.System.hotelsystem.models.Employee;
import Hotel.Registry.System.hotelsystem.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Person>{
    //This is where we can communicate with the mySQL database

}
