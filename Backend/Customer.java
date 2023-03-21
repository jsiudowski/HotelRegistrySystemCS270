package Backend;

public class Customer extends Person{
    public int customerID;
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
