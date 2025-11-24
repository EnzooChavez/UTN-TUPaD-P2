/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio3;


import java.util.ArrayList;
/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList();
        empleados.add(new EmpleadoPlanta("Cain", 1l, 12000));
        empleados.add(new EmpleadoTemporal("Julian", 2l, 4000));
        empleados.add(new EmpleadoPlanta("Carlos", 3l, 10000));
        empleados.add(new EmpleadoTemporal("Oscar", 4l, 6000));
        empleados.add(new EmpleadoPlanta("Favio", 5l, 18000));
        empleados.add(new EmpleadoTemporal("Santiago", 6l, 2500));
        
        for (Empleado empleado : empleados) {
            double sueldoAnual = empleado.calcularSueldoAnual();
            
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Sueldo empleado de planta: " + sueldoAnual);
            } else if (empleado instanceof EmpleadoTemporal){
                System.out.println("Sueldo empleado temporal: " + sueldoAnual);
            }
        }
    }
}
