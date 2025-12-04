package org.generation.classes;

public class Employee extends Person implements Pagable {

    private String department;
    private double dailySalary;

    public Employee(
            String name,
            int age,
            String email,
            String rfc,
            String address,
            String department,
            double dailySalary
    ) {
        super(name, age, email, rfc, address);
        this.department = department;
        this.dailySalary = dailySalary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setDailySalary(double dailySalary) {
        this.dailySalary = dailySalary;
    }

    @Override
    public String calculateSalary(int days) {
        double total = dailySalary * days;
        return String.format("%.2f", total);
    }

    // Versión sin días (por si quieres usarla en otro lado)
    public String calculateSalary() {
        return calculateSalary(30); // por ejemplo 30 días
    }

    @Override
    public String toString() {
        return "Employee [department=" + department +
               ", dailySalary=" + dailySalary +
               ", name=" + getName() +
               ", id=" + getId() + "]";
    }
}
