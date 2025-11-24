/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio12;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
    Contribuyente contribuyente = new Contribuyente("Cain", "123100123");
    Impuesto impuesto = new Impuesto(20000, contribuyente);
    Calculadora calculadora = new Calculadora();
    calculadora.calcular(impuesto);
    }
}
