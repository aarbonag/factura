/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aarbonag
 */
public class factura {
        String numero;
        String descripcion;
        int cantidad;
        double precio;

    public factura(String numero, String descripcion, int cantidad, double precio) {
        this.numero = numero;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    
   public String getNumero(){
       return numero;
   } 
   
   public void setNumero(String nuevoNumero){
       this.numero = nuevoNumero;
   }
   
   public String getDescripcion(){
       return descripcion;
   } 
   
   public void setDescripcion(String nuevaDescripcion){
       this.descripcion = nuevaDescripcion;
   }
   
   public int getCantidad(){
       return cantidad;
   } 
   
   public void setCantidad(int nuevaCantidad){
       this.cantidad = nuevaCantidad;
   }
   public double getPrecio(){
       return precio;
   } 
   
   public void setPrecio(double nuevaPrecio){
       this.precio = nuevaPrecio;
   }
        
    }
    
    

