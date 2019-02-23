/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

//Importamos la clase para recoger int por teclado
import static tema4.Ejercicio.teclado.teclado;
/**
 *
 * @author pietrodeocre
 */
public class siete {
    
    /**
     * Declaramos un parametro para usar el metodo de una clase 
     * que recoje el número por teclado
     */
    int teclado = tema4.Ejercicio.teclado.teclado();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos las variables
        int a, b;
        //Realizamos las operaciones de pedir los números por teclado
        System.out.print("Introduzca el primer número entero: ");
        //Usamos el parametro de la clase teclado() para recoger el número.
        a = teclado();
        System.out.print("Introduzca el segundo número entero: ");
        b = teclado();
        //Definimos condición
        if (a==b){
            System.out.println("Los números "+ a +" y "+ b +" son iguales");
        }else if (a>b){
            System.out.println("El "+ a +" es mayor");
        } else {
            System.out.println("El "+ b +" es mayor");
        }
    }
    
}
