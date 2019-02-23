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
public class doce {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b, c = 0;
        a = 0;
        b = 3;
        do {
            System.out.println(b +" * "+ a +" = "+ (b*a));
            ++a;
        } while (a<=10);
    }
    
}
