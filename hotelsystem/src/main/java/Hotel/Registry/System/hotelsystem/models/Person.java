package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {

    public String name;
    public int age;
    public String address;


    public Person() {
        name = "";
        age = 0;
        address = "";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

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

}