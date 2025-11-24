/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterfacesYExcepciones.Interfaces;


import java.util.ArrayList;
/**
 *
 * @author EnzoAChavez
 */
public class Pedido implements Pagable{
    private ArrayList<Producto> productos = new ArrayList();
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente, String estado) {
        this.cliente = cliente;
        this.estado = estado;
    }

    
    public void aniadirProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
    
    public void cambiarEstadoDelPedido(String nuevoEstado) {
        this.estado = nuevoEstado;
        cliente.cambiarEstadoDelPedido(nuevoEstado);
    }
    
}
