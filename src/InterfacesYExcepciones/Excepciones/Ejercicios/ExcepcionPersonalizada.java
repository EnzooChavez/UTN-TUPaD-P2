/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Excepciones.Ejercicios;


import InterfacesYExcepciones.Excepciones.Ejercicios.EdadInvalidaException;
import java.util.Scanner;
/**
 *
 * @author EnzoAChavez
 */
public class ExcepcionPersonalizada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese una edad");
        int edad = Integer.parseInt(scan.nextLine());
        if (edad <= 0 || edad >= 120) {
            throw new EdadInvalidaException("Ingreso una edad invalida");
        }

    }
}
