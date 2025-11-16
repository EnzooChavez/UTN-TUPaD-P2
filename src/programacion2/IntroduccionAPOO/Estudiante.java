/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.IntroduccionAPOO;

/**
 *
 * @author USER
 */
    public class Estudiante {
        
    // Atributos de la clase
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;
    
    // Método para mostrar información del estudiante
    public void mostrarInfo() {
        System.out.println("Informacion del estudiante: ");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Curso: " + curso);
        System.out.println("Calificacion: " + calificacion);
    }
    
    // Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
    
    public void subirCalificacion(double puntos){
        this.calificacion += this.calificacion;
    }
    
    public void bajarCalificacion(double puntos){
        this.calificacion -= this.calificacion;
    }
}
