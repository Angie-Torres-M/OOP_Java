package org.generation;

import org.generation.classes.Employee;
import org.generation.classes.Manager;
import org.generation.classes.Consultant;
import org.generation.classes.Person;

public class Main {
    public static void main(String[] args) {

        // Empleados normales
        Employee omar = new Employee(
                "Omar Martínez",
                24,
                "omar@gmail.com",
                "XAXX000000",
                "Domicilio conocido",
                "Development",
                389.50
        );

        Employee brenda = new Employee(
                "Brenda",
                23,
                "brenda@gmail.com",
                "XAXX000000",
                "Domicilio conocido",
                "Development",
                456.25
        );

        // Manager
        Manager jefe = new Manager(
                "Carlos Ruiz",
                40,
                "carlos@gmail.com",
                "XAXX000000",
                "CDMX",
                "Management",
                800.00,
                10,
                0.10
        );

        // Consultor persona moral
        Consultant consultor = new Consultant(
                "Servicios Empresariales S.A. de C.V.",
                "contacto@servicios.com",
                "ABC123456AB1",
                "Reforma 100, CDMX",
                "Consultoría Externa",
                40 // horas trabajadas
        );

        // Imprimir objetos
        System.out.println("========== OBJETOS ==========\n");
        System.out.println(omar);
        System.out.println(brenda);
        System.out.println(jefe);
        System.out.println(consultor);

        System.out.println("\nTotal de Personas/Empleados = " + Person.getTotal());

        // Tickets de pago
        System.out.println("\n========== TICKETS ==========\n");
        PayRoll.printReceipt(omar);
        PayRoll.printReceipt(brenda);
        PayRoll.printReceipt(jefe);
        PayRoll.printReceipt(consultor);
    }
}
