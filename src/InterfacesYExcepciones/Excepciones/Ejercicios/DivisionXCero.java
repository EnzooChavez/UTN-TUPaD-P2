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
public class DivisionXCero {
    public static void main(String[] args) {
        int num1,num2;
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Ingrese numero: ");
            num1 = Integer.parseInt(input.nextLine());
            
            System.out.print("Ingrese segundo numero: ");
            num2 = Integer.parseInt(input.nextLine());
            
        } catch (ArithmeticException ae) {
            System.out.println("Erorr: " + ae.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
