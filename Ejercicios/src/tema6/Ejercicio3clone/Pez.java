/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio3clone;

/**
 *
 * @author pietrodeocre
 */
public class Pez implements Cloneable{
    //Atributos
    private String nombre;
    
    //Getters and Setters
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    //toString
    @Override
    public String toString(){
        return " Pez  \n"+this.nombre+"\n";
    }
    
    //Clone
    @Override
    public Object clone()throws CloneNotSupportedException{
        Pez pez = (Pez)super.clone();
        return (Object)pez;
    }
    
    //Equals
    @Override
    public boolean equals(Object pez){
        return (pez instanceof Pez) && 
                (((Pez)pez).getNombre().equals(this.nombre));
    }
    
    
    //Finalize
    @Override
    public void finalize()throws Throwable {
        System.out.println("Objeto finalizado");
        super.finalize();
    }
    
    public Pez(){
        
    }
    
    public Pez(String nombre){
        this.nombre= nombre;
    }
    
}
