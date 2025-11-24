/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio4;


import java.util.ArrayList;
/**
 *
 * @author EnzoAChavez
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro ("Dogo Argentino", 5));
        animales.add(new Gato ("Michi", 3));
        animales.add(new Vaca(15, 300));
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("------------------");
        }
    }
}
