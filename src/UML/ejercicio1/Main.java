/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio1;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("Cain Cabrera", 12345678);
        Pasaporte pasaporte = new Pasaporte(123456, "2023-01-01", "foto.jpg", "JPEG");
        titular.setPasaporte(pasaporte);
        System.out.println("Pasaporte número: " + pasaporte.getNumero());
        System.out.println("Titular: " + pasaporte.getTitular().getNombre());
        System.out.println("Foto: " + pasaporte.getFoto().getImagen());
        
    }
}
