package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer extends Person{
    //Primary key
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long id;
    //Check dev notes, editing classes, for annotation meanings

    public Customer() {
        super();
    }

    public Customer(Long customerId) {
        this.id = customerId;
    }

    public Customer(Long customerId, String name, int age, String address, boolean isEmployee) {
        super(name, age, address, isEmployee);
        this.id = customerId;
    }

    public Long getCustomerID() {
        return this.id;
    }

    public void setCustomerID(Long newCustomerID) {
        this.id = newCustomerID;
    }
}
