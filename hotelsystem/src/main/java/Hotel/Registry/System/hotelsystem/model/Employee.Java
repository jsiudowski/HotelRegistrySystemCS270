package Hotel.Registry.System.hotelsystem.model;

public class Employee extends Person{


    //public Boolean employee;
    public String position;
    private String Ssn;
    public String employeeId;

    public Employee()
    {
        employeeId = "";
        position = "";
        Ssn = "";
        //Person.employee = true;
        //The compiler doesn't like this^
    }

    public Employee(Boolean employee, String position, String Ssn, String employeeId) {
        //this.employee = true;
        this.position = position;
        this.Ssn = Ssn;
        this.employeeId = employeeId;
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
    public void setEmployeeID(Employee Employee, String employeeId) {
        Employee.employeeId = employeeId;
    }

    public String getEmployeeID(Employee Employee) {
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