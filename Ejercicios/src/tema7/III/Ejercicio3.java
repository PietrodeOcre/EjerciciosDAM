/*
 * Realiza un programa que cree 1000 números aleatorios y muestre los 10 mayores.
 */
package tema7.III;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3 {
    public static void main(String[] args){
        int[] vector = new int[1000];
        
        alatorio(vector);
        
        int [] resultado = new int [10];
        for(int i=0; i<10; i++){
            resultado[i] = encontrarMaximo(vector);
        }
        
        System.out.println(Arrays.toString(resultado));
        
        
        int[] numeros = new int [1000];
        int[] maximos = new int [10];
        
        Random r = new Random();
        
        alatorio(numeros);
        
        for(int x = 10; x<numeros.length; x++){
            for(int y=0; y<maximos.length; y++){
                if(numeros[x]>maximos[y]){
                    maximos[y]=numeros[x];
                    break;
                }
            }
        }
        
        
        System.out.println(Arrays.toString(numeros));
        System.out.print(Arrays.toString(maximos));
        
        StringBuffer stb = new StringBuffer("hola");
        
        repetidos(stb);
        
    }
    
    private static void alatorio(int[] vector){
        Random r = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = r.nextInt(999);
            
                
            
        }
    }
    
    private static int encontrarMaximo(int[] numero){
        int maximo = numero[0];
        
        for (int i = 1; i<numero.length; i++ ){
            if (numero[0] >maximo){
                maximo = numero[i];
            }
        }
        return maximo;
    }
    
    private static void repetidos(StringBuffer stb){

        for(int i=0; i<stb.length(); i++){
            if(stb.charAt(i) == 'a' ||
                    stb.charAt(i) == 'e' ||
                    stb.charAt(i) == 'i' ||
                    stb.charAt(i) == 'o' ||
                    stb.charAt(i) == 'u' ||
                    stb.charAt(i) == 'A' ||
                    stb.charAt(i) == 'E' ||
                    stb.charAt(i) == 'I' ||
                    stb.charAt(i) == 'O' ||
                    stb.charAt(i) == 'U'
                    ){
                stb.deleteCharAt(i);
            }
        }
        System.out.println(stb);
    }
}
