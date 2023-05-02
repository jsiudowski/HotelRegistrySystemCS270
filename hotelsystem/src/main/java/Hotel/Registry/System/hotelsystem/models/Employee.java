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


    // employee Name 
    public void setEmployeeName(String newEmployeeName)
    {
        this.name = newEmployeeName;
    }

    public String getEmployeeName()
    {
        return this.name;
    }
    
    // employee Ssn 
    public void setEmployeeSSN(String Ssn)
    {
        this.ssn = Ssn;
    }

    public String getEmployeeSSN()
    {
        return this.ssn;
    }

    // employee ID 
    public void setEmployeeID(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getEmployeeID() {
        return this.employeeId;
    }

    // employee position 

    public void setEmployeePosition(String position) {
        this.position = position ;
    }

    public String getEmployeePosition() {
        return this.position;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
}