/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class ventinueve {
    public static int multiplodetres, cont;
    public static void main(String[] args) {
        // Objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definimos las variables
        cont = 0;
        //Creamso el bucle
        do{
            System.out.println("Escribe un número: ");
	  //Preguntamos el número
            multiplodetres = sc.nextInt();
            esMultiploDe3(multiplodetres);
            cont++;
        }while (cont<5);
    }
    
    public static void esMultiploDe3(int multiplodetres){
        if (multiplodetres%3 == 0){ //Si el número dividido por 3 tiene resto 0, es múltiplo
                System.out.println("Este un número: "+multiplodetres+", es múltiplo de tres.");
        }
    }
}
