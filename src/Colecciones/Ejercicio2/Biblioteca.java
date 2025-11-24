/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author EnzoAChavez
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarLibro (String isbn, String titulo,int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros () {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
    
    public void buscarProducto (String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                System.out.println("Libro encontrado: " + libro);
            }
        }
    }
    
    public void eliminarLibro(String isbn) {
        Libro libroEliminado = null;
        for (Libro libro : libros) {
            if (isbn != null && libro.getIsbn().equals(isbn)) {
                libroEliminado = libro;
            }
        }
        if (libroEliminado != null) {
            libros.remove(libroEliminado);
        return;

        }
    }
        
    public int cantLibros(){
        return libros.size();
    }
    
    public void filtrarLibrosPorAnio(int anio) {
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                System.out.println(libro);
            }
        }
    }
    
    public void mostrarAutoresDisponibles () {
        for (Libro libro : libros) {
            System.out.println("Autor: " + libro.getAutor());
        }
    }
}
