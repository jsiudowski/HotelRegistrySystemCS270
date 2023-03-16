package Backend;

public abstract class Person {

    public String name;
    public int age;
    protected String address;
    public boolean employee;

    public Person() {
        name = "";
        age = 0;
        address = "";
        employee = false;
    }

    public Person(String name, int age, String address, boolean employee) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.employee = employee;
        
    }

    public void setName(Person person,String name) {
        person.name = name;
    }

    public String getName(Person person) {
        return person.name;
    }

    public void setAddress(Person person, String address) {
        person.address = address;
    }

    protected String getAddress(Person person) {
        return person.address;
    }

    public void setAge(Person person, int age) {
        person.age = age;
    }

    public int getAge(Person person) {
        return person.age;
    }

    public void setEmployee(Person person, boolean employeeStatus) {
        person.employee = employeeStatus;
    }

    public boolean getEmployee(Person person) {
        return person.employee;
    }
}