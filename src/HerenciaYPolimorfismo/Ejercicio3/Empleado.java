/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio3;

/**
 *
 * @author EnzoAChavez
 */
public abstract class Empleado {
    private String nombre;
    private Long id;
    private double sueldoMensual;

    public Empleado(String nombre, Long id, double sueldoMensual) {
        this.nombre = nombre;
        this.id = id;
        this.sueldoMensual = sueldoMensual;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    public abstract double calcularSueldoAnual();
    
}
