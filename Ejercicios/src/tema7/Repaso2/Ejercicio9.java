/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Repaso2;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio9 {
    
    private static int mediaEnterosMenosMayorYMenor (int[]array){
        //Devuelve la media de un array sin contar el primer puesto y el ultimo
        int media = 0;
        int resp;
        int j;
        for (int i = 1; i<array.length; i++){
            int a= array[i];
            for(j=i-1; j>0 && array[j]>a; j--){
                array[j+1] = array[j];
                   
            }
            array[j+1]=a;
        }
        for (int i = 1; i < array.length-1; i++) {
            media = media + array[i];
            //System.out.println(media);
        }
        resp = media/((array.length)-2);
        return resp;
    }
    
    public static void main(String[] args) {
        
        int[] array = {1,3,4,6,5,7,8,5};
        //int[] array2 = mediaEnterosMenosMayorYMenor(array);
        System.out.println(Arrays.toString(array));
        System.out.println(mediaEnterosMenosMayorYMenor(array));
    }
    
}
