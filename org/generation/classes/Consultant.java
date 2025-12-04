package org.generation.classes;

public class Consultant extends Person implements Pagable {

    private String department;
    private int hoursWorked;
    private double hourlyRate; // 1322 por hora

    public Consultant(
            String name,
            String email,
            String rfc,
            String address,
            String department,
            int hoursWorked
    ) {
        // edad fija 0 porque es una persona moral; puedes cambiarlo si quieres
        super(name, 0, email, rfc, address);
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = 1322.0;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public String calculateSalary(int days) {
        double total = hourlyRate * hoursWorked;
        return String.format("%.2f", total);
    }

    @Override
    public String toString() {
        return "Consultant [department=" + department +
               ", hoursWorked=" + hoursWorked +
               ", hourlyRate=" + hourlyRate +
               ", name=" + getName() +
               ", id=" + getId() + "]";
    }
}
