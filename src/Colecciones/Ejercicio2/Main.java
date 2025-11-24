/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio2;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Harvard");
        
        Autor autor1 = new Autor("ASD123", "Robert C. Martin", "Britanico");
        Autor autor2 = new Autor("ASD123", "Julian Alvarez", "Argentino");
        Autor autor3 = new Autor("ASD123", "Jorge Luis", "Chino");
        
        biblioteca.agregarLibro("3198199823", "Clean Code", 2008, autor1);
        biblioteca.agregarLibro("1231312321", "Clean Architecture", 2019, autor1);
        biblioteca.agregarLibro("9182381234", "The Clean Coder", 2020, autor1);
        biblioteca.agregarLibro("1233454567", "Habitos Atomicos", 2020, autor2);
        biblioteca.agregarLibro("0174597432", "Padre rico, padre pobre", 2021, autor3);
        
        System.out.println("Vemos libros disponibles: ");
        biblioteca.listarLibros();
        System.out.println("________________________________");
        
        System.out.println("Buscamos Libro por ISBN: ");
        biblioteca.buscarProducto("3198199823");
        System.out.println("________________________________");
        
        System.out.println("Ver libros por anio: ");
        biblioteca.filtrarLibrosPorAnio(2020);
        
        System.out.println("Eliminamos Libro: ");
        System.out.println("________________________________");
        biblioteca.eliminarLibro("0174597432");
        System.out.println("Mostramos la lista sin el libro eliminado: ");
        biblioteca.listarLibros();
        System.out.println("________________________________");
        
        System.out.println("Cantidad total de libros: " + biblioteca.cantLibros());
        System.out.println("________________________________");
        
        System.out.println("Listamos autores disponibles: ");
        biblioteca.mostrarAutoresDisponibles();
        
    }
}
