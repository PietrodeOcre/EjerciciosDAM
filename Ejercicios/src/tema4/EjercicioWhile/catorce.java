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
public class catorce {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos el objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definimos variables
        int contador, sumador, numerouno;
        //Asignar variables
        contador=0;
        sumador=0;
        //Definimos Condiciones
        do {
            //Pedimos número
            System.out.print("Escribe un numero: ");
            numerouno = sc.nextInt();
            if (numerouno>=0){
                //Realizamos operaciones
                contador++;
                sumador += numerouno;
            }
        } while (numerouno>=0);
        System.out.println("La media es: "+(sumador/contador));
    }
}
