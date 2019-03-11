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
public class Ejercicio2 {
    
    private static boolean triangularBajo(int [][]matriz){
        if(matriz.length == matriz[0].length){
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    if(i<j){
                        if(matriz[i][j]!=0){
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        int matriz[][] = {{1,0,0,},{0,1,0},{1,0,1}};
        
        System.out.println(triangularBajo(matriz));
    }
    
}
