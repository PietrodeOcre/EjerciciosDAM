/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author pietrodeocre
 */
public class Persona {
    /**
     * Sexo por defecto
     */
    private final static char SEXO_DEF = 'H';
    
    private final static int BAJO_PESO = -1;
    private final static int PESO_IDEAL = 0;
    private final static int SOBRE_PESO = 1;
    
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    
    public Persona(){
        this.nombre = "";
        this.edad = 0;
        
        this.sexo = 'H';
        this.peso = 0;
        this.altura = 0;
    }

    Persona(String nombre, int edad, char sexo) {
        
    }

    Persona(String nombre, int edad, char sexo, double peso, double altura) {
        
    }
    
    public int calcularIMC(){
        double pesando = this.peso / (Math.pow(this.altura, 2));
        
        if (pesando>=20 && pesando<=25) {
            return PESO_IDEAL;
        } else if (pesando<20){
            return BAJO_PESO;
        } else {
            return SOBRE_PESO;
        }
    }
    
    public boolean esMayorDeEdad(){
        return (this.edad>17);
    }
    
    private char comprobarSexo(char sexo){
        if (sexo == 'H' || sexo == 'M'){
            if (sexo!='H'){
                return this.sexo = 'M';
            }else {
                return this.sexo = SEXO_DEF;
            }
        }else{
            return this.sexo = SEXO_DEF;
        }
    }
    
    //Método toString
    @Override
    public String toString(){
        String mensaje= "La persona se llama "+this.nombre+" y tiene "+this.edad+
                " edad, su DNI es "+this.dni+" y es de sexo "+this.sexo+", pesa "+
                this.peso+" y su altura es "+this.altura;
        return mensaje;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public double getPeso(){
        return this.peso;
    }
    
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double getAltura(){
        return this.altura;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    
    String generaDNI(){
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        
        System.out.println(""+numDNI+"-"+letraDNI());
        dni = (""+numDNI+"-"+letraDNI());
        return (""+numDNI+"-"+letraDNI());
    }
    
    char letraDNI(){
        int letra = ThreadLocalRandom.current().nextInt(0, 23);
        char letras[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return letras[letra];
    }
    
    
}
