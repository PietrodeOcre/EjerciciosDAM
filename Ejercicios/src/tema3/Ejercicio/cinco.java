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
public class cinco {
    
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Definimos las variables
        int a, b, c, d, e;
        boolean f, g;
        
        //Asignamos valores a las variables
        a = 5;
        b = 3;
        c = -12;
        d = c*b;
        e = a*b;
        f = d>a && e<a;
        g = e<=a || b<=e;
        
        //Mostramos valores iniciales de las variables
        System.out.println("El valor inicial de a = 5 es "+a);
        System.out.println("El valor inicial de b = 3 es "+b);
        System.out.println("El valor inicial de c = -12 es "+c);
        System.out.println("El valor inicial de d = c*b es "+d);
        System.out.println("El valor inicial de e = a*b es "+e);
        System.out.println("El valor inicial de f = d>a && e<a es "+f);
        System.out.println("El valor inicial de g = e<=a || b<=e es "+g);
        
        
    }
    
}
