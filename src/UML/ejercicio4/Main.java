/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio4;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Cain", 44206015);
        Banco banco = new Banco("BNA", 20212323);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(2487123,"29/23",banco);
        tarjeta.setBanco(banco);
        System.out.println("Banco: " + banco.getNombre());
        System.out.println("Tarjeta: " + tarjeta.getBanco().getNombre());
    }
}
