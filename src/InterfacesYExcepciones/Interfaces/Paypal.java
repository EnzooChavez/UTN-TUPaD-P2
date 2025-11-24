/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Interfaces;

/**
 *
 * @author EnzoAChavez
 */
public class Paypal implements PagoConDescuento {
 
    @Override
    public void procesarPago(double pago) {
        double totalPrecio = aplicarDescuento(pago);
        System.out.println("El total del pedido es: " + totalPrecio);
        System.out.println("El pago fue realizado");
        
    }
    @Override
    public double aplicarDescuento(double monto) {
        return monto - (monto * 0.30);
    }
    
}
