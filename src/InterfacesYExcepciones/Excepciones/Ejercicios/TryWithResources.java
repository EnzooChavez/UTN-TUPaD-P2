/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Excepciones.Ejercicios;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author EnzoAChavez
 */
public class TryWithResources {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Lenovo\\OneDrive\\Documentos\\NetBeansProjects\\EjercitacionTpOcho\\src\\main\\java\\Excepciones\\ArchivoALeer.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error de E/S: "+ ex.getMessage());
        } 
    }
}
