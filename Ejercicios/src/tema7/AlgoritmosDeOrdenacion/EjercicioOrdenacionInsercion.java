/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.AlgoritmosDeOrdenacion;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioOrdenacionInsercion {
    
    public static void main (String[] args){
        int[] array=new int[3];
        
        ordeacionInsercion(array);
        
    }
    
    private static void ordeacionInsercion(int[] array){
        
        int j = 0;
        
        for (int i = 1; i<array.length; i++){
            int a= array[i];
            for(j=i-1; j>0 && array[j]>a; j--){
                array[j+1] = array[j];
            }
            array[j+1]=a;
        }
        
    }
    
    
    
}
