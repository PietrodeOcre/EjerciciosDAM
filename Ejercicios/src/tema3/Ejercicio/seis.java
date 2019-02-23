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
public class seis {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos e inicializamos las constantes
        final int A = 5, B = 9, C = 4;
        int d = A * B * C;
        /*
            Intento de modificación de las mismas, 
            nos da error por que no se puede modificar una constante
        */
        //a = 3;
        //b = 4;
        //c = 1;
        
        //Multiplicamos todas las constantes
        System.out.println("El producto de las variables es "+d);
        
    }
    
}
