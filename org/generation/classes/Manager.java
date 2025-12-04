package org.generation.classes;

public class Manager extends Employee {

    private int numberEmployees;
    private double percentage; // bono porcentual sobre el sueldo

    public Manager(
            String name,
            int age,
            String email,
            String rfc,
            String address,
            String department,
            double dailySalary,
            int numberEmployees,
            double percentage
    ) {
        super(name, age, email, rfc, address, department, dailySalary);
        this.numberEmployees = numberEmployees;
        this.percentage = percentage;
    }

    public int getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(int numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String calculateSalary(int days) {
        double base = getDailySalary() * days;

        double bonusPerEmployee = 25.0;
        double bonusEmployees = numberEmployees * bonusPerEmployee;

        double bonusPercentage = base * percentage;

        double total = base + bonusEmployees + bonusPercentage;
        return String.format("%.2f", total);
    }

    @Override
    public String toString() {
        return "Manager [employees=" + numberEmployees +
               ", percentage=" + percentage +
               ", name=" + getName() +
               ", dailySalary=" + getDailySalary() +
               ", id=" + getId() + "]";
    }
}
