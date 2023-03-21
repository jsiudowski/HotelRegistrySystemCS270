package Backend;

public class Employee{


    //public Boolean employee;
    public String position;
    private String Ssn;
    public String employeeId;

    public Employee()
    {
        //employee = true;
        employeeId = "";
        position = "";
        Ssn = "";
    }

    public Employee(Boolean employee, String position, String Ssn, String employeeId) {
        //this.employee = true;
        this.position = position;
        this.Ssn = Ssn;
        this.employeeId = employeeId;
    }

    public void EmployeeName(Employee Employee)
    {
        
    }

    public void setEmployeeID(Employee Employee, String employeeId) {
        Employee.employeeId = employeeId;
    }

    public String getEmployeeID(Employee Employee) {
        return Employee.employeeId;
    }

}