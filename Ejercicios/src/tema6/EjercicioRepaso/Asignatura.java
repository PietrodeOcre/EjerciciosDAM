/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioRepaso;

/**
 *
 * @author pietrodeocre
 */
public class Asignatura implements Cloneable{
    private String id;
    private String nombre;
    
    //Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Clone

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    //toString
    @Override
    public String toString() {
        return "Asignatura{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    //equals
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return obj instanceof Asignatura &&
                ((Asignatura)obj).getId().equals(this.id) &&
                ((Asignatura)obj).getNombre().equals(this.nombre); 
    }

    //finalize
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
