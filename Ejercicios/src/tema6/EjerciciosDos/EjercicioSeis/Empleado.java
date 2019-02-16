/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjerciciosDos.EjercicioSeis;

/**
 *
 * @author pietrodeocre
 */
public class Empleado implements Cloneable{
    public static int id =1;  // Número de 3 cifras
    private int identificador;
    private String nombre;      // Nombre de empleado
    private int edad;           // Número
    private char sexo;          // "H" Hombre, "M" Mujer
    private long numeroSS;      // Número Seguridad Social
    
    //Constructores
    public Empleado(){
        identificador = Empleado.id++;  
    }
    
    public Empleado(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public Empleado(String nombre, int edad, char sexo, long numeroSS){
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.numeroSS = numeroSS;
    }
    
    public Empleado (Empleado empleado){
        this();
        this.nombre = empleado.getNombre();
        this.edad = empleado.getEdad();
        this.sexo = empleado.getSexo();
        this.numeroSS = empleado.getNumeroSS();
    }
    
    //Getters and Setters
    public int getIdentificador() {
        return identificador;
    }

    /*private setIdentificador(int identificador) {    
        this.identificador = identificador;
    }*/

    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public char getSexo(){
        return sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public long getNumeroSS(){
        return numeroSS;
    }
    
    public void setNumeroSS (long numeroSS){
        this.numeroSS = numeroSS;
    }
    
    //equals
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        return !((obj instanceof Empleado) &&
                (((Empleado)obj).nombre.equals(this.nombre)) &&
                (((Empleado)obj).edad == this.edad));
    }
    
    //Clone
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
    
    
//toString
    @Override
    public String toString() {
        return "Empleado{" + "identificador=" + identificador + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", numeroSS=" + numeroSS + '}';
    }
    
    
}
