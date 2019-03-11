/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Tema6 {
    
    private static String nombre, dni;
    private static int edad;
    private static char sexo;
    private static double peso, altura;
    static Persona persona = new Persona();
    static Persona persona1 = new Persona(Tema6.nombre, Tema6.edad, Tema6.sexo);
    static Persona persona2 = new Persona(Tema6.nombre, Tema6.edad, Tema6.sexo, Tema6.peso, Tema6.altura);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);
 
        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        Tema6.pedirDatos();
        asignarValores(nombre, edad, sexo, peso, altura);
   
        Tema6.pesoIdeal(persona);
        Tema6.pesoIdeal(persona1);
        Tema6.pesoIdeal(persona2);
        
        Tema6.mayorEdad(persona);
        Tema6.mayorEdad(persona1);
        Tema6.mayorEdad(persona2);
        
        
        System.out.println(persona.toString());
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
    }
    
    public static void pedirDatos(){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        Tema6.nombre = sc.nextLine();
        
        System.out.print("Escribe tu edad: ");
        Tema6.edad = sc.nextInt();
        
        System.out.print("Escribe tu sexo: ");
        //El charAt(0) selecciona el primer caracter de una cadena 
        //con lo que podemos pedir un solo caracter por teclado
        Tema6.sexo = sc.next().charAt(0);
        
        System.out.print("Escribe tu peso: ");
        Tema6.peso = sc.nextDouble();
        
        System.out.print("Escribe tu Altura: ");
        Tema6.altura = sc.nextDouble();
        
    }
    
    public static void asignarValores(String nombre, int edad, char sexo, double peso, double altura){
        
        persona.setNombre(nombre);
        persona.setEdad(edad);
        persona.setSexo(sexo);
        persona.setPeso(peso);
        persona.setAltura(altura);
        Tema6.dni = persona.generaDNI();
        
        persona1.setNombre(nombre);
        persona1.setEdad(edad);
        persona1.setSexo(sexo);
        persona1.setPeso(peso);
        persona1.setAltura(altura);
        Tema6.dni = persona1.generaDNI();
        
        persona2.setNombre(nombre);
        persona2.setEdad(edad);
        persona2.setSexo(sexo);
        persona2.setPeso(peso);
        persona2.setAltura(altura);
        Tema6.dni = persona2.generaDNI();
        
    }
    
    public static void pesoIdeal(Persona persona) {
        System.out.print(Tema6.persona.getNombre()+" tiene un peso ");
        System.out.println(Tema6.persona.calcularIMC());
        System.out.print(persona2.getNombre()+" tiene un peso ");
        System.out.println(persona1.calcularIMC());
        System.out.print(persona2.getNombre()+" tiene un peso ");
        System.out.println(persona2.calcularIMC());
        
                
        
    }
    
    public static void mayorEdad(Persona persona){
        System.out.println(persona.getNombre()+" es "+((Tema6.persona.esMayorDeEdad())?"mayor de edad.":"menor de edad."));
    }
}
