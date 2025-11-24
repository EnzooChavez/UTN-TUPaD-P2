/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HerenciaYPolimorfismo.Ejercicio4;

/**
 *
 * @author EnzoAChavez
 */
    public class Vaca extends Animal {
    private int Anios;
    private double peso;

    public Vaca(int Anios, double peso) {
        this.Anios = Anios;
        this.peso = peso;
    }

    public int getAnios() {
        return Anios;
    }

    public double getPeso() {
        return peso;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("MUUUUUUUUUUUUUU");
    }
    
    public void describirAnimal() {
        System.out.println("Vaca: \n" + "Anios: " + getAnios() + "\n" + "Peso: "
        + getPeso());
    }

    @Override
    public String toString() {
        return "Vaca{" + "Anios=" + Anios + ", peso=" + peso + '}';
    }
}
