/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio1;

/**
 *
 * @author pietrodeocre
 */
public class Cuenta {
    private String titular;
    private double cantidad;
    
    //Constructor de la clase con un parametro
    public Cuenta(String nombre){
        this.titular=nombre;
    }
    
    //Método toString
    @Override
    public String toString(){
        String mensaje= "El empleado se llama "+titular+" y tiene un salario de "+cantidad;
        return mensaje;
    }
    
    //Setter de titular
    public void setTitular(String nombre){
        titular = nombre;
    }
    
    //Getter de titular
    public String getTitular(){
        return titular;
    }
    
    //Setter de cantidad
    public void setCantidad(double cant){
        cantidad = cant;
    }
    
    //Getter de cantidad
    public double getCantidad(){
        return cantidad;
    }
    
    //Método de ingresar
    public void ingresar(double cantidad){
        if (cantidad<0){
        this.cantidad += cantidad;
        }
    }
    
    //Método de retirar
    public void retirar(double cantidad){
        if((this.cantidad-cantidad)<0){
            this.cantidad=0;
        }else{
            this.cantidad-=cantidad;
        }
    }
    
}
