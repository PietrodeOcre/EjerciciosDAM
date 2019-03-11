/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.Ejercicio;

/**
 *
 * @author pietrodeocre
 */
public class cuatro {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos 4 variables enteras
        int a, b, c, d;
        
        //Asigno un valor a cada una
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        int f = b;
        
        //Mostramos los valores de las varibles
        System.out.println("El valor inicial de a es "+a);
        System.out.println("El valor inicial de a es "+b);
        System.out.println("El valor inicial de a es "+c);
        System.out.println("El valor inicial de a es "+d);
        
        //Ejecutar las operaciones de asignación
        b = c;
        c = a;
        a = d;
        d = f;
        
        //Mostramos los nuevos valores
        System.out.println("El nuevo valor de a es "+a);
        System.out.println("El nuevo valor de a es "+b);
        System.out.println("El nuevo valor de a es "+c);
        System.out.println("El nuevo valor de a es "+d);
        
    }
    
}
