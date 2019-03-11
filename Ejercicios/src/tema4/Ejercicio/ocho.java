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
public class ocho {

    /**
     * Declaramos un parametro para usar el metodo de una clase 
     * que recoje el número por teclado
     */
    int teclado = tema4.Ejercicio.teclado.teclado();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b;
        //Introducimos parametros por teclado con la clase teclado();
        System.out.println("Introduce el primer número:");
        a=teclado();
        System.out.println("Introduce el segundo número:");
        b=teclado();
        //Definimos la condición
        System.out.println("La división del mayor entre el menor es "+ a +" y "+ b +" es "+((a==b)?1:((a>b)?(a/b):(b/a))));
    }
    
}
