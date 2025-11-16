/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.IntroduccionAPOO;

/**
 *
 * @author USER
 */
public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    
    public void setAnioPublicacion(int anioPublicacion){
        int anioActual = 2025;
        if (anioPublicacion > 0 && anioPublicacion <= anioActual){
            this.anioPublicacion = anioPublicacion;
        }
    }
    
    // Método para mostrar información
    public void mostrarInfo() {
        System.out.println("Informacion de la mascota: ");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de Publicacion: " + anioPublicacion);
    }
}
