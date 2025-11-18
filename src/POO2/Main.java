/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO2;

/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===\n");
        
        // Crear empleados usando diferentes constructores
        
        // Usando constructor con todos los parámetros
        Empleado empleado1 = new Empleado(1, "Ana García", "Gerente", 5000.0);
        Empleado empleado2 = new Empleado(2, "Carlos López", "Desarrollador", 3000.0);
        
        // Usando constructor con solo nombre y puesto (id automático y salario por defecto)
        Empleado empleado3 = new Empleado("María Rodríguez", "Analista");
        Empleado empleado4 = new Empleado("Pedro Martínez", "Diseñador");
        
        // Mostrar información de los empleados
        System.out.println("=== INFORMACIÓN DE EMPLEADOS ===");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Aplicar métodos actualizarSalario() sobre distintos empleados
        System.out.println("\n=== ACTUALIZACIONES DE SALARIO ===");
        
        // Aumento por porcentaje
        System.out.println("Aumento por porcentaje para " + empleado1.getNombre() + ":");
        empleado1.actualizarSalario(10.0); // 10% de aumento
        
        // Aumento por cantidad fija
        System.out.println("Aumento por cantidad fija para " + empleado2.getNombre() + ":");
        empleado2.actualizarSalario(500); // $500 de aumento
        
        // Aumento por porcentaje para otro empleado
        System.out.println("Aumento por porcentaje para " + empleado3.getNombre() + ":");
        empleado3.actualizarSalario(15.0); // 15% de aumento
        
        // Mostrar información actualizada
        System.out.println("\n=== INFORMACIÓN ACTUALIZADA ===");
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        
        // Mostrar total de empleados usando el método estático
        System.out.println("\n=== ESTADÍSTICAS ===");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
        
        // Probar getters y setters (encapsulamiento)
        System.out.println("\n=== PRUEBA DE ENCAPSULAMIENTO ===");
        System.out.println("Nombre del empleado 4: " + empleado4.getNombre());
        empleado4.setPuesto("Diseñador Senior");
        empleado4.setSalario(1500.0);
        System.out.println("Empleado 4 actualizado: " + empleado4.toString());
        
        // Mostrar total final
        System.out.println("\n=== TOTAL FINAL ===");
        System.out.println("Total de empleados en el sistema: " + Empleado.mostrarTotalEmpleados());
    }
}
