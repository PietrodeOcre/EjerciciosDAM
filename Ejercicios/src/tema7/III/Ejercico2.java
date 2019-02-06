/*
Realiza un método esCapicua que tome como parámetro un entero y 
devuelva true si el número es capicua y false en caso contrario. 
Utiliza un objeto de la clase StringBuffer.
 */
package tema7.III;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercico2 {
    
    public static void main (String[] args){
        System.out.print(esCapicua(11011));
    }
    
    private static boolean esCapicua(int num){
        boolean esCapicua = false;       
        StringBuffer str = new StringBuffer(String.valueOf(num));       
        if (str.reverse().toString().equals(String.valueOf(num))){
            esCapicua = true;            
        }
        return esCapicua;      
    }   
}
