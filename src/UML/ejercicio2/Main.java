/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UML.ejercicio2;

/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
    Usuario usuario = new Usuario("Cain Cabrera",4400232);
    Bateria bateria = new Bateria("SUPER", 100);
    Celular celular = new Celular("jdk", "Iphone", "17 pro", bateria);
    
    usuario.setCelular(celular);
    System.out.println("Usuario: " + celular.getUsuario().getNombre());
    System.out.println("Batería: " + celular.getBateria().getModelo());
    System.out.println("Celular: " + celular.getMarca());
    }
}
