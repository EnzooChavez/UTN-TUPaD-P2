/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio3;

/**
 *
 * @author EnzoAChavez
 */
public class EmpleadoPlanta extends Empleado {

    public EmpleadoPlanta(String nombre, Long id, double sueldoMensual) {
        super(nombre, id, sueldoMensual);
    }
    
    @Override
    public double calcularSueldoAnual() {
        return getSueldoMensual() * 12;
    }
    
}
