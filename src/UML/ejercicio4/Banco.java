/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio4;

/**
 *
 * @author EnzoAChavez
 */
public class Banco {
    private String nombre;
    private int cuit;

    public Banco(String nombre, int cuit) {
        this.nombre = nombre;
        this.cuit = cuit;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }
}
