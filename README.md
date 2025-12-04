# OOP — Programación Orientada a Objetos en Java

Este proyecto demuestra los pilares de OOP en Java: **encapsulación**, **abstracción**, **validaciones** y **excepciones personalizadas**.  
Incluye clases del dominio (Person, Employee, Consultant, Manager) y un sistema básico de nómina.

## Características
- Encapsulación con getters/setters validados.
- Excepciones personalizadas: `EmailFormatException`, `RfcFormatException`.
- Jerarquía de clases Employee → Consultant / Manager.
- Clase `PayRoll` para cálculos básicos de pago.
- `Main` para ejecución y pruebas.

## Estructura
src/
├─ generation.exceptions/
│ ├─ EmailFormatException.java
│ └─ RfcFormatException.java
├─ org.generation/
│ ├─ Main.java
│ └─ PayRoll.java
└─ org.generation.classes/
├─ Person.java
├─ Employee.java
├─ Consultant.java
└─ Manager.java

## Tecnologías
- Java 8+
- Eclipse IDE

## Ejecución
Ejecuta `Main.java` para ver validaciones y manejo de excepciones.
