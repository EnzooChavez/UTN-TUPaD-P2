/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Excepciones.Ejercicios;


import java.util.Scanner;
/**
 *
 * @author EnzoAChavez
 */
public class ConvertirNumeroACadena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int convertir;
        
        try {
            System.out.print("Ingrese una frase: ");
            frase = input.nextLine();
            convertir = Integer.parseInt(frase);
            
        } catch (NumberFormatException nfe) {
            System.out.println("Se precisaba una frase..");
        }
        System.out.println("Fin del programa.");
        input.close();
        

    }
}
