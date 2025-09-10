/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion2;

import java.util.Scanner;
/**
 *
 * @author enzoa
 */
public class IntroduccionAJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 2:
        System.out.println("¡Hola, Java!");
        
        //Eerjcicio 3:
        String nombre = "Enzo";
        int edad = 26;
        double altura = 1.75;
        boolean estudiante = true;
        System.out.println(nombre);
        System.out.println(edad);
        System.out.println(altura);
        System.out.println(estudiante);
        
        //Ejercicio 4:
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        String nombre4 = input.nextLine();
        System.out.println("Ingresa tu edad: ");
        int edad4 = Integer.parseInt(input.nextLine());
        System.out.println("Tu nombe es: " + nombre4 + " y tu edad es: " + edad4);
        
        //Ejercicio 5:
        
        Scanner input5 = new Scanner(System.in);
        System.out.println("Ingresa un numero: ");
        int num1 = Integer.parseInt(input5.nextLine());
        System.out.println("Ingresa otro numero: ");
        int num2 = Integer.parseInt(input5.nextLine());
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multi = num1 * num2;
        double divi = (double) num1 / num2;
        
        System.out.println("La suma es : " + suma + ", la resta es: " + resta + ", la multiplicacion es: " + multi + ", y su division es: " + divi);
        
        
        //Ejercicio 6:
        System.out.println("Nombre: Juan Perez \\nEdad: 30 años \\nDirección:Calle Falsa 123");
        
        //Ejercicio 8:
        
        Scanner input8 = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num18 = input8.nextInt();
        System.out.println("Ingrese otro numero:");
        int num28 = input8.nextInt();
        int divi8 = num18 / num28 ;
        System.out.println("El resultado de la division es: " + divi8);

        Scanner input9 = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        double num19 = input9.nextDouble();
        System.out.println("Ingrese otro numero:");
        double num29 = input9.nextDouble();
        double divi9 = num19 / num29 ;
        System.out.println("El resultado de la division es: " + divi9);
    }
    
}
