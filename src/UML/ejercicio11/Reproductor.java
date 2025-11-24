/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio11;

/**
 *
 * @author EnzoAChavez
 */
public class Reproductor {
    private Cancion cancion;
    public void ReproducirCancion(Cancion cancion) {
        System.out.println("Tema sonando: " + cancion.getTitulo() + " \nDe " + cancion.getArtista().getNombre());
    }
}
