/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

/**
 *
 * @author pietrodeocre
 */
public class cuatro {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definir variables
        int numero, impares;
        numero = 1;//Asignamos valores
        impares = 0;
        while (numero<=1000){ //Evaluamos primera condición
            if (numero%2!=0){ //Evaluamos segunda condición
                System.out.println(numero); //Mostramos número
                impares++;
            }
            numero++; //Incrementamos número
        }
        System.out.println("Numero de impares: "+impares); //Mostramos número
    }
}
