package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.*;

@Entity
public class Employee extends Person {

    //Primary key:
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long employeeId;
    //Foreign Key
    public @ManyToOne Hotel hotel;
    public String position;
    private String ssn;
    public Boolean isAdmin;

    /*
    protected Employee()
    {
        position = "";
        ssn = "";
        isAdmin = false;
        //Person.employee = true;
        //The compiler doesn't like this^
    }


    public Employee(Hotel hotel,  String position, String Ssn, Boolean admin) {
        this.hotel = hotel;
        this.position = position;
        this.ssn = Ssn;
        this.isAdmin = admin;
    }
    */

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
    public void setEmployeeSSN(Employee Employee, String Ssn)
    {
        Employee.ssn = Ssn;
    }

    public String getEmployeeSSN(Employee Employee)
    {
        return Employee.ssn;
    }

    // employee ID 
    public void setEmployeeID(Employee Employee, Long employeeId) {
        Employee.employeeId = employeeId;
    }

    public Long getEmployeeID(Employee Employee) {
        return Employee.employeeId;
    }

    // employee position 

    public void setEmployeePosition(Employee Employee, String position) {
        Employee.position = position ;
    }

    public String getEmployeePosition(Employee Employee) {
        return Employee.position;
        
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}