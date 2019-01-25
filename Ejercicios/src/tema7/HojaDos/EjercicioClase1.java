/*
 * ejercicio matrices ) crear matriz de 4 filas y 5 columnas de enteros y 
 * completarlo con numeros aleatorios del 1 a 1000. Y mostrarlo en pantalla.
 */
package tema7.HojaDos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioClase1 {
    
    public static void main(String[] args){
        int[][] matrizPrueba1 = new int[3][4];
        
        rellenaMatriz(matrizPrueba1);
        
        mostrar(matrizPrueba1);
    }
    
    
    private static int[][] rellenaMatriz(int[][] matriz){
        
        //Scanner sc = new Scanner(System.in);
        Random r = new Random();
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = r.nextInt(1000)+1;
            }
	}
        return matriz;
    }
    
    private static void mostrar(int[][] matriz){

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("-> " + matriz[i][j] + " ");
            }
            System.out.print("\n");
            
        } 
        
    }
    
}
