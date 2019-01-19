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
public class Alumno implements Cloneable {
    //Atributos
    private int idAlumno, edad;
    private String nombre;
    private Universidad universidad;
    
    //Getters and Setters

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", edad=" + edad + ", nombre=" + nombre + ", universidad=" + universidad + '}';
    }
    
    //sobreescribir Clone
    @Override
    public Object clone()throws CloneNotSupportedException{
        Alumno alumno = (Alumno)super.clone();
        alumno.universidad = (Universidad)this.universidad.clone();
        return (Object)alumno;
    }
    
    //Sobreescribe equals
   @Override
    public boolean equals(Object alumno){
        return ((alumno instanceof Alumno) && 
                (((Alumno)alumno).nombre.equals(this.nombre)) &&
                (((Alumno)alumno).universidad.equals(this.universidad)) &&
                (((Alumno)alumno).idAlumno==this.idAlumno) &&
                (((Alumno)alumno).edad==this.edad)) ? true : false;
    }
    
    //Sobreescribe finalize
    @Override
    public void finalize() throws Throwable {
        System.out.println("Objeto finalizado");
        super.finalize();
        
    }
    
}
