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
public class Universidad implements Cloneable {
    //Atributos
    private int idUniversidad, telefono;
    private String nombre, direccion;
    private Rectorado rectorado;
    
    //Getters and Setters

    public int getIdUniversidad() {
        return idUniversidad;
    }

    public void setIdUniversidad(int idUniversidad) {
        this.idUniversidad = idUniversidad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Rectorado getRectorado() {
        return rectorado;
    }

    public void setRectorado(Rectorado rectorado) {
        this.rectorado = rectorado;
    }
    
    //toString

    @Override
    public String toString() {
        return "Universidad{" + "idUniversidad=" + idUniversidad + ", telefono=" + telefono + ", nombre=" + nombre + ", direccion=" + direccion + ", rectorado=" + rectorado + '}';
    }
    
    //Sobreescribir clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        Universidad universidad = (Universidad)super.clone();
        universidad.rectorado = (Rectorado)this.rectorado.clone();
        return (Object)universidad;
        
    }
    
    //Sobreescribe equals
   @Override
    public boolean equals(Object universidad){
        return ((universidad instanceof Universidad) && 
                (((Universidad)universidad).idUniversidad == this.idUniversidad) &&
                (((Universidad)universidad).rectorado.equals(this.rectorado))) ? true : false;
    }
    
    //Sobreescribe finalize
    @Override
    public void finalize() throws Throwable {
        System.out.println("Objeto finalizado");
        super.finalize();
        
    }
}
