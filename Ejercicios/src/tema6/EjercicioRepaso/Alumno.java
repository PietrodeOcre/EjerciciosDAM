/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioRepaso;

import java.util.Objects;

/**
 *
 * @author pietrodeocre
 */
public class Alumno implements Cloneable{
    private String nombre;
    private int edad;
    // Este atributo puede ser "H" para hombres y "M" para mujeres
    private char sexo;
    private Expediente expediente;
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }
    
    //Clone
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Alumno alumno = (Alumno)super.clone();
        alumno.expediente = (Expediente)this.expediente.clone();
        return alumno; 
    }
    
    //toString
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", expediente=" + expediente + '}';
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
        if (obj instanceof Alumno && 
             ((Alumno)obj).getNombre().equals(this.nombre) &&
             (((Alumno)obj).getEdad() == this.edad) &&
             ((Alumno)obj).getExpediente().equals(this.expediente)){
           return true; 
        }
        return false;
    }
    
    //finalize
    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }
    


    
    
    

    
}
