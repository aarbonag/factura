/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aarbonag
 */
public class factura {
        int numero;
        String descripcion;
        int cantidad;
        double precio;

    
   public int getNumero(){
       return numero;
   } 
   
   public void setNumero(int nuevoNumero){
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
   
   public void setPrecio(double nuevoPrecio){
       this.precio = nuevoPrecio;
   }
   
   public double getTotalFactura(int cantidad, double precio){
       double total=0;
       total=cantidad*precio;
       return total;
   }
        
    }
    
    

