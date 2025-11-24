/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio1;

/**
 *
 * @author EnzoAChavez
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;
    
    public Auto(String modelo,String marca, int cantidadPuertas){
        super(modelo,marca);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    
    @Override
    public void mostrarInfo() {
        System.out.println("\nModelo: " + getModelo() + "\nMarca: " +
                getMarca() + "\nCantidad de puertas: " + getCantidadPuertas());
    }
}
