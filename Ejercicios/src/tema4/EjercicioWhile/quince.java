/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class quince {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definimos variable
        int numerouno, i;
        //Pedimos un número
        System.out.print("Escribe un número: ");
        numerouno = sc.nextInt();
        for (i=1;i<=numerouno;++i){
            System.out.println(i);
        }
    }
}
