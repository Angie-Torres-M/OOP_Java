package org.generation.classes;

/**
 * Cualquier objeto que se pueda pagar (imprimir recibo)
 * debe implementar estos métodos.
 */
public interface Pagable {

    String getName();

    String getRfc();

    String getDepartment();

    int getId();

    String calculateSalary(int days);
}
