/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio3;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("Richard parcker","new york");
        Autor autor = new Autor("Ivan de pineda","argentino");
        Libro libro = new Libro("Banco ICBC","hola",editorial);
        libro.setAutor(autor);
        libro.mostrarInformacion();
    }   
}
