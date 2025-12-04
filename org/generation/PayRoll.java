package org.generation;

import java.util.Date;
import org.generation.classes.Pagable;

public class PayRoll {

    public static void printReceipt(Pagable e) {

        System.out.println("+--------------------------------------------+");
        System.out.println("|                  RECIBO                    |");
        System.out.println("| Fecha: " + new Date());
        System.out.println("| Recibo de pago de: " + e.getName());
        System.out.println("| RFC: " + e.getRfc());
        System.out.println("| Departamento: " + e.getDepartment());
        System.out.println("| Por la cantidad de MXN $ " + e.calculateSalary(30));
        System.out.println("| Número de empleado: " + e.getId());
        System.out.println("+--------------------------------------------+");
        System.out.println();
    }
}
