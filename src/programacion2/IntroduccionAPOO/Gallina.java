/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion2.IntroduccionAPOO;

/**
 *
 * @author USER
 */
public class Gallina {
    private String idGallina;
    private int edad;
    private int huevosPuestos;

    public String getIdGallina() {
        return idGallina;
    }

    public void setIdGallina(String idGallina) {
        this.idGallina = idGallina;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHuevosPuestos() {
        return huevosPuestos;
    }

    public void setHuevosPuestos(int huevosPuestos) {
        this.huevosPuestos = huevosPuestos;
    }
            
    public void ponerHuevo(){
        this.huevosPuestos += 1;
    }
    public void envejecer(){
        this.edad += 1;
    }
    public void mostrarEstado(){
        System.out.println("ID: " + this.idGallina);
        System.out.println("Huevos Puestos: " + this.huevosPuestos);
        System.out.println("Edad: " + this.edad);
    }
}
