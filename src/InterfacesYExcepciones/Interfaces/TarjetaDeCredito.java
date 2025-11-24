/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Interfaces;

/**
 *
 * @author EnzoAChavez
 */
public class TarjetaDeCredito implements Pago{

    @Override
    public void procesarPago(double monto) {
        System.out.println("El monto total es: " + monto);
        System.out.println("Pago realizado");
        
    }
}
