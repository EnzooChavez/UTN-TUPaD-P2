/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Interfaces;

/**
 *
 * @author EnzoAChavez
 */
public class Cliente implements Notificable {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cambiarEstadoDelPedido(String nuevoEstado) {
        System.out.println("Estado de su pedido: " + nuevoEstado);
    }
}
