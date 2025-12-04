package org.generation.classes;

public abstract class Person {

    private String name;
    private int age;
    private String email;
    private String rfc;
    private String address;

    private int id;
    private static int total = 0;

    public Person(String name, int age, String email, String rfc, String address) {
        this.name = (name == null ? "SIN NOMBRE" : name.toUpperCase());
        this.age = (age < 18) ? 18 : age;
        this.email = (email == null ? "" : email.toLowerCase());
        this.rfc = (rfc == null ? "" : rfc.toUpperCase());
        this.address = (address == null ? "DOMICILIO CONOCIDO" : address);

        Person.total++;
        this.id = Person.total;
    }

    // Getters básicos
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getRfc() {
        return rfc;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public static int getTotal() {
        return total;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", email=" + email +
               ", rfc=" + rfc + ", address=" + address + ", id=" + id + "]";
    }
}
