/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioApuntes1;

/**
 *
 * @author pietrodeocre
 */
public class Persona implements Cloneable{
    private double altura, peso;
    private String nombre, apellido, dni;
    private char sexo;
    private int edad;
    private Empresa empresa;
    
    
        

    /*public static void main (String[] args){
        Persona manuel = new Persona();
        manuel.setNombre("Manuel");
        manuel.setEdad(38);
        manuel.setColorPelo("Marron");
        manuel.setAltura(185.5);
        manuel.setSexo('H');
        
        
        Persona manuelClonado = manuel;
        
        manuelClonado.setSexo('M');
        
        System.out.println(manuel);
        System.out.println(manuelClonado);
        
        /*
            En el ejercicio1
            Realiza el clonado correctamente, pero cuando modificas un 
           atributo de alguno de los objetos se modifica en los dos.
        */
   /* }*/
    
    
    
    public Object clone() throws CloneNotSupportedException{
        //Object objeto = new Object();
        //Reescribir el objeto object, persona y empresa
        Persona manuel = (Persona)super.clone();
        manuel.empresa =(Empresa)empresa.clone();
        //Empresa empresa = (Empresa)empresa.clone();
        
        /*try {
            //objeto = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }*/
        return (Persona)manuel;
        
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    

    

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "altura=" + altura + ", peso=" 
                + peso + ", nombre=" + nombre + ", apellido=" 
                + apellido + ", dni=" + dni + ", sexo=" + sexo 
                + ", edad=" + edad + ", empresa=" + empresa 
                + '}';
    }

    

    
  
    
}
