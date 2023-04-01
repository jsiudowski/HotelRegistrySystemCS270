package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee extends Person {

    //Primary key:
    public @Id @GeneratedValue int employeeId;

    //Foreign Key
    public @ManyToOne Hotel hotel;

    public String position;
    private String ssn;

    protected Employee()
    {
        position = "";
        ssn = "";
        //Person.employee = true;
        //The compiler doesn't like this^
    }

    public Employee(Hotel hotel,  String position, String Ssn) {
        this.hotel = hotel;
        this.position = position;
        this.ssn = Ssn;
    }

    // employee Name 
    public void setEmployeeName(Employee Employee, String newEmployeeName)
    {
        Employee.name = newEmployeeName;
    }

    public String getEmployeeName(Employee Employee)
    {
        return Employee.name;
    }
    
    // employee Ssn 
    private void setEmployeeSSN(Employee Employee, String Ssn)
    {
        Employee.ssn = Ssn;
    }

    private String getEmployeeSSN(Employee Employee)
    {
        return Employee.ssn;
    }

    // employee ID 
    public void setEmployeeID(Employee Employee, int employeeId) {
        Employee.employeeId = employeeId;
    }

    public int getEmployeeID(Employee Employee) {
        return Employee.employeeId;
    }

    // employee position 

    public void setEmployeePosition(Employee Employee, String position) {
        Employee.position = position ;
    }

    public String getEmployeePosition(Employee Employee) {
        return Employee.position;
        
    }

}