/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2;

/**
 *
 * @author USER
 */
public class Empleado {
    //Instanciamos atributos
    
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    
    // Constructor que recibe todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; 
    }
    
    // Constructor que recibe solo nombre y puesto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // ID automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 1000.0; // Salario por defecto
        totalEmpleados++; // Incrementar contador estático
    }
    
        // Métodos sobrecargados actualizarSalario
    
    // Método que recibe porcentaje de aumento
    public void actualizarSalario(double porcentaje) {
        if (porcentaje > 0) {
            double aumento = this.salario * (porcentaje / 100);
            this.salario += aumento;
            System.out.println("Salario actualizado: " + this.salario + " (aumento del " + porcentaje + "%)");
        }
    }
    
    // Método que recibe cantidad fija a aumentar
    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
            System.out.println("Salario actualizado: " + this.salario + " (aumento fijo de " + cantidadFija + ")");
        }
    }
    
    // Método toString()
    @Override
    public String toString() {
        return "Empleado [ID: " + id + 
               ", Nombre: " + nombre + 
               ", Puesto: " + puesto + 
               ", Salario: $" + String.format("%.2f", salario) + "]";
    }
    
    // Método estático mostrarTotalEmpleados()
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Getters y Setters (Encapsulamiento)
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        }
    }
}
    

