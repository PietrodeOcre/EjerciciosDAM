/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio5Clone;

/**
 *
 * @author pietrodeocre
 */
public class Persona implements Cloneable{
    //Atributos
    private String dni, nombre, apellidos;
    private int edad;
    
    
    //Getters and Setters

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    

    
    
    //toString
    @Override
    public String toString(){
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    //Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        /*Persona persona = (Persona)super.clone();
        return (Object)persona;*/
        return super.clone();
    }
    
    //equals
    public boolean equals(Object persona){
        return (persona instanceof Persona) &&
                (((Persona)persona).getDni().equals(this.dni));
    }
    
}
