package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer extends Person{
    //Primary key
    public @Id @GeneratedValue int customerId;
    //Check dev notes, editing classes, for annotation meanings
    public String customerName;
    public int customerAge;

    public Customer() {
        super();
        customerId = 0;
    }

    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public Customer(int customerId, String name, int age, String address, boolean isEmployee) {
        super(name, age, address, isEmployee);
        this.customerId = customerId;
    }

    public int getCustomerID() {
        return this.customerId;
    }

    public void setCustomerID(Customer customer, int newCustomerID) {
        customer.customerId = newCustomerID;
    }
}
