/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Colecciones.Ejercicio1;

/**
 *
 * @author EnzoAChavez
 */
public class Producto {
    private String id;
   private String nombreProducto;
   private Double precio;
   private int StockDisponible;
   private CategoriaProducto categoria;

    public Producto(String id, String nombreProducto, Double precio, int StockDisponible, CategoriaProducto categoria) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.StockDisponible = StockDisponible;
        this.categoria = categoria;
    }
   
   public void mostrarInfo() {
       System.out.println("ID: " + getId());
       System.out.println("Nombre: " + getNombreProducto());
       System.out.println("Precio: " + getPrecio());
       System.out.println("Stock: " + getStockDisponible());
       System.out.println("Categoria: " + getCategoria());
   }

    public void setStockDisponible(int StockDisponible) {
        this.StockDisponible = StockDisponible;
    }
             
    public String getId() {
        return id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getStockDisponible() {
        return StockDisponible;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombreProducto=" + nombreProducto + ", precio=" + precio + ", StockDisponible=" + StockDisponible + ", categoria=" + categoria + '}';
    }
}
