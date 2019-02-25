/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso2;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    private static boolean simetricMatriz(int[][] matriz){
        
        boolean esSimetrica = false;
        
        if (matriz.length == matriz[0].length){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[0].length; j++) {
                    if ( matriz[i][j] != matriz[j][i]){
                        return false;
                    }
                }
            }
            return true;
        }
        return esSimetrica;
    }
    
    public static void main(String[] args) {
        int matriz[][] = {{1,0,1}, {0,1,0},{1,0,1}};
        
        System.out.println(simetricMatriz(matriz));
  
    }
    
}
