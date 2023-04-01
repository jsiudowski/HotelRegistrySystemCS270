package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee extends Person {


    //public Boolean employee;
    public String position;
    private String Ssn;
    public @Id @GeneratedValue int employeeId;

    protected Employee()
    {
        position = "";
        Ssn = "";
        //Person.employee = true;
        //The compiler doesn't like this^
    }

    public Employee(String position, String Ssn) { //Deleted employee boolean because the compiler didn't like it
        //this.employee = true;
        this.position = position;
        this.Ssn = Ssn;
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
        Employee.Ssn = Ssn;
    }

    private String getEmployeeSSN(Employee Employee)
    {
        return Employee.Ssn;
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