/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio4;

/**
 *
 * @author EnzoAChavez
 */
public class Perro extends Animal{
    private String raza;
    private int edad;

    public Perro(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("Ladrando..");
    }
    
    @Override
    public void describirAnimal(){
        System.out.println("Perro: \nRaza: " + getRaza());
        System.out.println("Edad: " + getEdad());
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", edad=" + edad + '}';
    }
    
}
