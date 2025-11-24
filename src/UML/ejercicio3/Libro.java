/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio3;

/**
 *
 * @author EnzoAChavez
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Autor autor;
    private Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
        this.autor = autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
    
    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo + " Autor: " + autor.getNombre() + 
                " editorial: " + editorial.getNombre() + " " + editorial.getDireccion());
    }
}
