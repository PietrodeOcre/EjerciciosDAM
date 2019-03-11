/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class seisSegunda {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Creamos objeto de teclado
        Scanner sc=new Scanner(System.in);
        // Definimos variables
        String nombre=" ", bach=" ", acces=" ";
        System.out.print("Escribe tu nombre:");
        nombre = sc.nextLine();
        System.out.print("Escribe 'si' o 'no', tienes un bachiller:");
        bach = sc.nextLine();
        System.out.print("Escribe 'si' o 'no', tienes un Acceso a grado superior:");
        acces = sc.nextLine();
        System.out.print("Según tu expediente"+((bach=="si"||acces=="si")?" puedes hacer grado superior":" no puedes hacer grado superior"));
        
    }
}
