/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio1;

import java.util.ArrayList;
/**
 *
 * @author EnzoAChavez
 */
public class Inventario {
    ArrayList<Producto> productos = new ArrayList<>();

    public Inventario() {
    }
    
    public void agregarProducto(Producto nuevoProducto) {
        if (nuevoProducto != null) {
            this.productos.add(nuevoProducto);
        }
    }
    
    public void listarProductos() {
        for (Producto producto : productos) {
            System.out.println("Producto: " + producto);
        }
    }
    
    public void eliminarProducto(String id) {
        Producto productoEliminado = null;
        for (Producto producto : productos) {
            if (id != null && producto.getId().equals(id)) {
                productoEliminado = producto;
        }
        if (productoEliminado != null) {
            productos.remove(productoEliminado);
            return;
            }
        }
    }
    
    public void filtrarPorCategoria (CategoriaProducto categoria) {
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                System.out.println("Producto: " + producto.getNombreProducto() + " categoria: " + categoria);
            } 
        }
    }
    
    public Producto buscarProducto (String id) {
        Producto productoBuscado = null;
        int i = 0;
        while(i < productos.size() && productoBuscado == null) {
            Producto producto = this.productos.get(i);
            if (producto.getId().equalsIgnoreCase(id)) {
                productoBuscado = producto;
            }
            i++;
        }
        return productoBuscado;
    }
    
    public void actualizarStock(String id, int cantidadNueva) {
        Producto producto = buscarProducto(id);
        if (cantidadNueva < 0) {
            throw new IllegalArgumentException("La cantidad no puede ser negativa.");
        }
        
        producto.setStockDisponible(producto.getStockDisponible() + cantidadNueva);
    }
    
    public void  obtenerTotalStock() {
        int cantStock = 0;
        for (Producto producto : productos) {
            cantStock += producto.getStockDisponible();
        }
        System.out.println("Cantidad de stock total: " + cantStock);
    }
    
    public Producto obtenerProductoMayorStock() {
       Producto productoMayorStock = null;
       int stockMayor = -1;
       int i = 0;
       for (Producto producto : productos) {
            if (producto.getStockDisponible() > stockMayor) {
                productoMayorStock = producto;
                stockMayor = producto.getStockDisponible();
            }
            i++;
        }
        return productoMayorStock;
    }
    
    public ArrayList<Producto> filtrarPorPrecio(int precioMin, int precioMax) {
        ArrayList<Producto> listaDePrecios =  new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= precioMin && producto.getPrecio() <= precioMax) {
                listaDePrecios.add(producto);
            }
        }
        return listaDePrecios;
    }
    
    public void mostrarCategoriasDisponible() {
        for (CategoriaProducto categoria : CategoriaProducto.values()) {
            System.out.println("- " +(categoria.getDescripcion()));
        }
    }
}
