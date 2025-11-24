/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio1;

/**
 *
 * @author EnzoAChavez
 */
public class Vehiculo {
    private String modelo;
    private String marca;

    public Vehiculo(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
    
    public void mostrarInfo() {
        System.out.println("Modelo: " + getModelo() + "\n"
                + "Marca: " + getMarca());
    }
}
