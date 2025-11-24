/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio13;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        GeneradorQR generador = new GeneradorQR();
        Usuario usuario = new Usuario("Cain", "firulais@gmail.com");
        
        generador.generar("23",usuario);
    }
}
