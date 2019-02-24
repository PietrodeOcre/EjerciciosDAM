/*
 * ejercicio matrices ) crear matriz de 4 filas y 5 columnas de enteros y 
 * completarlo con numeros aleatorios del 1 a 1000. Y mostrarlo en pantalla.
 */
package tema7.HojaDos;

import java.util.Random;


/**
 *
 * @author pietrodeocre
 */
public class EjercicioClase1 {
    
    public static void main(String[] args){
        //Creamos la matríz 
        int[][] matrizPrueba1 = new int[4][5];
        
        //Llenamos al matríz
        rellenaMatriz(matrizPrueba1);
        
        //Mostramos la matríz
        mostrar(matrizPrueba1);
    }
    
    //Este método llena la matríz de números aleatorios
    private static int[][] rellenaMatriz(int[][] matriz){
        Random r = new Random();
        for (int i=0; i<matriz.length; i++) {
            for (int j=0; j<matriz[i].length; j++){
                matriz[i][j] = r.nextInt(1000)+1;
            }
	}
        return matriz;
    }
    
    private static void mostrar(int[][] matriz){
        //Este método muestra nuestra matríz de manera ordenada
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                System.out.print("-> " + matriz[i][j] + " ");
            }
            System.out.print("\n");            
        }         
    }
    
    
    
    
    
    
    
    
}
