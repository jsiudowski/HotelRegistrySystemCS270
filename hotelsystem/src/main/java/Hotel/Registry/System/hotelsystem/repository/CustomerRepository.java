package Hotel.Registry.System.hotelsystem.repository;

import Hotel.Registry.System.hotelsystem.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
