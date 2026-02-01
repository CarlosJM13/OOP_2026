package edu_carlos_mendez.actividad3.models;
/**
 * Clase que representa a un empleado con salario, edad y departamento.
 */
public class Empleado {
    private double salario;
    private int edad;
    private String departamento; // Nuevo campo

    public Empleado(double salario, int edad, String departamento) {
        this.salario = salario;
        this.edad = edad;
        this.departamento = departamento;
    }
    public double getSalario() { return salario; }
    public int getEdad() { return edad; }
    public String getDepartamento() { return departamento; }
}
