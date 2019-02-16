/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.AlgoritmosDeOrdenacion.Ejercicio.Persona;

/**
 *
 * @author pietrodeocre
 */
public class Empleado implements Comparable<Empleado>, Cloneable{
    //Definición de atributos
    private static int id;
    private int identificador;
    private String nombre;
    private String dni;

    
    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    

    //Constructor
    public Empleado() {
    }
    
    public Empleado(String nombre){
        this.identificador = id++;
    }

    //Sobreescribe el método compareTo()
    @Override
    public int compareTo(Empleado o) {
        return this.nombre.compareTo(o.getNombre());
    }

    //toString

    @Override
    public String toString() {
        return "Empleado{" + "identificador=" + identificador + ", nombre=" + nombre + ", dni=" + dni + '}';
    }
    
    
    //Clone
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
