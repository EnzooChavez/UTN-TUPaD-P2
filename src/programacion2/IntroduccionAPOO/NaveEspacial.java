/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.IntroduccionAPOO;

/**
 *
 * @author USER
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }
    
    
    public void despegar(){
    if (this.combustible >= 5) {
        System.out.println("La nave despego");
        this.combustible -= 5;
    } else {
        System.out.println("No hay suficiente combustible");
    }
}
    public void avanzar(int distancia){
        if ((distancia * 2) <= this.combustible) {
            System.out.println("La nave avanzo" + distancia + "kms");
            this.combustible -= (distancia * 2);
        } else {
            System.out.println("No hay suficiente combustible");
        }
}
    public void recargarCombustible(int cantidad){
        int maximo = 100;
        if ((cantidad + this.combustible) <= maximo) {
            this.combustible += cantidad;
        } else {
            System.out.println("Hay demasiado combustible");
            }
}
    public void mostrarEstado(){
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Combustible: " + this.combustible);
}
}
