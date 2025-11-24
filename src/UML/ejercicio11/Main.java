/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio11;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
    Artista artista = new Artista("Robert Sicks", "Rock");
    Cancion cancion = new Cancion("Black - PearJam",artista);
    Reproductor mp3 = new Reproductor();
    
    mp3.ReproducirCancion(cancion);
    
    }
}
