/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2;

import java.util.Scanner;

/**
 *
 * @author enzoa
 */
public class ProgramacionEstructurada {
    //Ejercicio 8:
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        impuesto = impuesto / 100;   // Convertimos a decimal
        descuento = descuento / 100; // Convertimos a decimal
        
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;   
    }
    
    //Ejercicio 9:
    public static double calcularCostoEnvio(double peso, String zona) {
        zona = zona.toLowerCase();

        if (zona.equals("nacional")) {
            return peso * 5;
        } else if (zona.equals("internacinal")) {
            return peso * 10;
        } else {
            System.out.println("Zona no valida. Se calculara como Nacional");
            return peso * 5;
        }
    }
    
    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
    
    public static int actualizarStock( int stockActual,int cantidadVendida,int cantidadRecibida){
        int nuevoStock = (stockActual - cantidadVendida) + cantidadRecibida;
        return nuevoStock;
    }
    
    private static final double DESCUENTO_ESPECIAL = 0.10;
    
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double precioFinal = precio - descuentoAplicado;
        
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }    
        //Ejercicio 11:
    public static void imprimirRecursivo(double[] array, int indice) {
        if (indice >= array.length) {
            return; // Caso base: termina la recursión
        }
        System.out.println("Precio: $" + array[indice]); // Trabajo actual
        imprimirRecursivo(array, indice + 1); // Llamada recursiva
    
    }
    
    public static void main(String[] args) {
    //Ejercicio 1: Escribe un programa en Java que solicite al usuario un año y determine si es bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea divisible por 400
    
    Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un año: ");
        int anio = scanner.nextInt();
        
        boolean esBisiesto = false;
        
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                }
            } else {
                esBisiesto = true;
            }
        }
        
        // Mostrar el resultado
        if (esBisiesto) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    
    
    //Ejercicio 2: Escribe un programa en Java que pida al usuario tres números enteros y determine cuál es el mayor.
        System.out.println("Ingrese el primero de tres numeros enteros para saber el mayor: ");
        int num11 = scanner.nextInt();
        System.out.println("Ingrese el segundo de tres numeros enteros para saber el mayor: ");
        int num21 = scanner.nextInt();
        System.out.println("Ingrese el ultimo de los tres numeros enteros para saber el mayor: ");
        int num31 = scanner.nextInt();
        
        if (num11 > num21 && num11 > num31) {
            System.out.println("El numero mayor es: " + num11);
        } else if (num21 > num11 && num21 > num31) {
            System.out.println("El numero mayor es: " + num21);
        } else {
            System.out.println("El numero mayor es: " + num31);
    }
        //Ejercicio 3:Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        
        if (edad < 12) {
            System.out.println("Usted es un Niño");
        } else if (edad >= 12 && edad <= 17){
            System.out.println("Usted es un Adolescente");
        } else if (edad >= 18 && edad <= 59){
            System.out.println("Usted es un Adulto");
        } else if (edad >= 60){
            System.out.println("Usted es un Adulto Mayor");
        }
        
        //Ejercicio 4: Escribe un programa que solicite al usuario el precio de un producto y su categoría (A, B o C).
        System.out.println("Ingrese precio de un producto: ");
        double precio = scanner.nextDouble();
        System.out.println("Ingrese su categoría de descuento (A=10%, B=15% o C=20%): ");
        char categoria = scanner.next().charAt(0);
        
        switch (categoria) {
    case 'A':
        double precioDescuento = precio * 0.10;
        System.out.println("El precio final del producto con el descuento del 10% es: " + (precio - precioDescuento));
        break;
    case 'B':
        precioDescuento = precio * 0.15;
        System.out.println("El precio final del producto con el descuento del 15% es: " + (precio - precioDescuento));
        break;
    case 'C':
        precioDescuento = precio * 0.20;
        System.out.println("El precio final del producto con el descuento del 20% es: " + (precio - precioDescuento));
        break;
    default:
        System.out.println("Categoría inválida.");
        break;
        }
        

        //Ejercicio 5: Escribe un programa que solicite números al usuario y sume solo los
        //números pares. El ciclo debe continuar hasta que el usuario ingrese el número
        //0, momento en el que se debe mostrar la suma total de los pares ingresados.
        
        int numero, suma = 0;
        do {
            System.out.println("Ingrese un numero para sumar (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
            if (numero % 2 == 0 && numero != 0) {
                suma += numero;
            }
        } while (numero != 0);
        System.out.println("La suma de todos los numeros pares ingresados es: " + suma);
        
        //Ejercicio 6: Escribe un programa que pida al usuario ingresar 10 números enteros y
        //cuente cuántos son positivos, negativos y cuántos son ceros.

        int numEj6, contPositivos = 0, contNegativos = 0,contCeros = 0;
            
            for (int i = 1; i <= 10; i++) {
            System.out.println("Ingrese el numero " + i + ": ");
            numEj6 = Integer.parseInt(scanner.nextLine());
            if (numEj6 > 0) {
                contPositivos += 1 ;
            } else if (numEj6 < 0) {
                contNegativos += 1 ;
            } else if (numEj6 == 0){
            contCeros += 1;
            }
            }
            System.out.println("La cantidad de numeros Positivos ingresados fue: " + contPositivos);
            System.out.println("La cantidad de numeros Negativos ingresados fue: " + contNegativos);
            System.out.println("La cantidad de numeros Ceros ingresados fue: " + contCeros);

        //Ejercicio 7: Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
        //usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
        //hasta que ingrese un valor válido.
        
        double nota;
        System.out.println("Ingrese su nota del 0 al 10: ");
        nota = Double.parseDouble(scanner.nextLine());
            
        while (nota < 0 || nota > 10) {
            System.out.println("ERROR. Ingrese su nota del 0 al 10: ");
            nota = Double.parseDouble(scanner.nextLine());   
        }
        System.out.println("Nota guardada correctamente.");

        //Ejercicio 8: Cálculo del Precio Final con impuesto y descuento.
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();
        
        System.out.print("Ingrese el impuesto en porcentaje: ");
        double impuesto = scanner.nextDouble();
        
        System.out.print("Ingrese el descuento en porcentaje: ");
        double descuento = scanner.nextDouble();

        double precioFinal = calcularPrecioFinal(precioBase, impuesto, descuento);

        System.out.println("El precio final del producto es: " + precioFinal);

        //Ejercicio 9: Composición de funciones para calcular costo de envío y total de compra
        System.out.println("Ingrese el precio del producto:");
        double precioProducto = scanner.nextDouble();
        
        System.out.println("Ingrese el peso del paquete en kg:");
        double peso = scanner.nextDouble();
        
        scanner.nextLine();
        
        System.out.println("Ingrese la zona de envio (Nacional / Internacional):");
        String zona = scanner.nextLine();

        double costoEnvio = calcularCostoEnvio(peso, zona);
        
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + totalCompra);
        
        //Ejercicio 10: Actualización de stock a partir de venta y recepción de productos.
        
        System.out.println("Ingrese el stock actual del producto: ");
        int stockActual = scanner.nextInt();
        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = scanner.nextInt();
        System.out.println("Ingrese la cantidad recibida:");
        int cantidadRecibida = scanner.nextInt();
        
        int nuevoStock = actualizarStock(stockActual, cantidadVendida, cantidadRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);
        
        //Ejercicio 11: Cálculo de descuento especial usando variable global.
        
        System.out.print("Ingrese el precio del producto: ");
        double precioProductoej12 = scanner.nextDouble();
        calcularDescuentoEspecial(precioProductoej12);

        //Ejercicio 12:  Modificación de un array de precios y visualización de resultados.

        
        double[] preciosej12 = {199.99, 299.5, 149.75, 399.0, 89.99};

        for (double precioej12 : preciosej12) {
        System.out.println("El precio es: $" + precioej12);
        }

        preciosej12[2] = 129.99;
        
        for (double precioej12 : preciosej12) {
        System.out.println("El precio es: $" + precioej12);
        }
        
        //Ejercicio 13:  Impresión recursiva de arrays antes y después de modificar un elemento.

        double[] preciosej13 = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double precioej13 : preciosej13) {
            System.out.println("Precio: $" + precioej13);
        }

        preciosej13[2] = 129.99;

        System.out.println("Precios modificados:");
        imprimirRecursivo(preciosej13, 0); 
    }
    }



