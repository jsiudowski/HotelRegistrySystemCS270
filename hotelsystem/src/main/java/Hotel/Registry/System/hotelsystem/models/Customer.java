package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer extends Person{
    //Primary key
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long customerId;
    //Check dev notes, editing classes, for annotation meanings
    public String customerName;
    public int customerAge;

    public Customer() {
        super();
    }

    public Customer(Long customerId) {
        this.customerId = customerId;
    }

    public Customer(Long customerId, String name, int age, String address, boolean isEmployee) {
        super(name, age, address, isEmployee);
        this.customerId = customerId;
    }

    public Long getCustomerID() {
        return this.customerId;
    }

    public void setCustomerID(Customer customer, Long newCustomerID) {
        customer.customerId = newCustomerID;
    }
}
