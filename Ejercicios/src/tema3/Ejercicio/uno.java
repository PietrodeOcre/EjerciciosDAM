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
public class uno {
    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // Declaramos las variables
        int n; 
        double a; 
        char c; 
        
        //Asignamos un valor a las variables
        n = 3;
        a = 1.3454345345345;
        c = 'a';
        
        //Mostramos el valor de todas las variables
        System.out.println("La variable INT n = "+n);
        System.out.println("La variable Double a = "+a);
        System.out.println("La variable char c = "+c);
        
        //Mostramos las operaciones con las variables 
        System.out.println("La suma de n + a es igual a "+(n+a));
        System.out.println("La resta de a - n es igual a "+(a-n));
        
        //Mostramos el valor numérico de la variable char
        System.out.println("El valor numérico correspondiente al carácter que contiene la variable c. "+((int)c));
    }
}
