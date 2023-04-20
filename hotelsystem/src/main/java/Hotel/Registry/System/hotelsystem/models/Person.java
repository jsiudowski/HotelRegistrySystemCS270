package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {

    public String name;
    public int age;
    public String address;
    public String userName;
    public String password;


    public Person() {
        name = "";
        age = 0;
        address = "";
    }

    public Person(String name, int age, String address, String user, String pass) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.userName = user;
        this.password = pass;

    }


    public void setName(Person person,String name) {
        person.name = name;
    }

    public String getName() {
        return this.name;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}