package Hotel.Registry.System.hotelsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Customer extends Person{
    public @Id @GeneratedValue int customerID;
    //Check dev notes, editing classes, for annotation meanings
    public String customerName;
    public int customerAge;

    public Customer() {
        super();
        customerID = 0;
    }

    public Customer(int customerID) {
        this.customerID = customerID;
    }

    public Customer(int customerID, String name, int age, String address, boolean isEmployee) {
        super(name, age, address, isEmployee);
        this.customerID = customerID;
    }

    public int getCustomerID(Customer customer) {
        return customer.customerID;
    }

    public void setCustomerID(Customer customer, int newCustomerID) {
        customer.customerID = newCustomerID;
    }
}
