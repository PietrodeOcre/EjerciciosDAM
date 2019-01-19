/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio2Clone;

/**
 *
 * @author pietrodeocre
 */
public class Rectorado implements Cloneable {
    
    //Atributos
    private int idRectorado, numDepartamento;
    private String nombre;
    
    //Getters and Setters

    public int getIdRectorado() {
        return idRectorado;
    }

    public void setIdRectorado(int idRectorado) {
        this.idRectorado = idRectorado;
    }

    public int getNumDepartamento() {
        return numDepartamento;
    }

    public void setNumDepartamento(int numDepartamento) {
        this.numDepartamento = numDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    //toString

    @Override
    public String toString() {
        return "Rectorado{" + "idRectorado=" + idRectorado + ", numDepartamento=" + numDepartamento + ", nombre=" + nombre + '}';
    }
    
    //Sobreescribir clone
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
        
    }
    
    //Sobreescribe equals
    @Override
    public boolean equals(Object rectorado){
        return ((rectorado instanceof Rectorado) && 
                (((Rectorado)rectorado).nombre.equals(this.nombre)) &&
                (((Rectorado)rectorado).numDepartamento == this.numDepartamento) &&
                (((Rectorado)rectorado).idRectorado == this.idRectorado))  ? true : false;
    }
    
    //Sobreescribe finalize
    @Override
    public void finalize() throws Throwable {
        System.out.println("Objeto finalizado");
        super.finalize();
        
    }
    
    
}
