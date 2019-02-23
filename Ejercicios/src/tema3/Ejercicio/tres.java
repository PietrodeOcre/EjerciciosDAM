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
public class tres {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables
        int a;
        
        //Asignamos un valor a la variable
        a = 1;

        //Mostramos las operaciones
        System.out.println("El valor de a es: "+ a);
        System.out.println("Aumentamos en 77 y quedan: "+ (a+=77));
        System.out.println("Restamso 3 y quedan: "+ (a-=3));
        System.out.println("Su doble será: "+ (a*=2));
    }
    
}
