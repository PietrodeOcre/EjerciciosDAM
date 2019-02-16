/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class MatrizAlreves {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el número de filas: ");
        int filas = sc.nextInt();
        System.out.println("Escribe el número de Columnas: ");
        int columnas = sc.nextInt();
        int matriz[][] = new int [filas][columnas];
        iniciaMatriz(matriz);
        
        imprimeMatriz(matriz);
        invertirMatriz(matriz);
        System.out.println("");
        imprimeMatriz(invertirMatriz(matriz));
        
    }
    
    private static void iniciaMatriz(int [][] matriz){
        Random r= new Random();
        
        for (int i=0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j]= r.nextInt(1000);
            }
        }
    }
    
    private static void imprimeMatriz(int [][] matriz){
        
        for (int i=0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+ " -> ");
            }
            System.out.println("");
            
        }
    }
    
    private static int[][] invertirMatriz(int[][] matriz){
        int [][] matrizInversa = new int [matriz.length][matriz[0].length];
        
        for (int i=0; i<matriz.length; i++){
            int cont = 0;
            for(int j = (matriz[i].length)-1; j>=0; j--){
                matrizInversa[i][cont] = matriz[i][j];
                cont++;
            }
            
        }
        return matrizInversa;
    }
    
    
}
