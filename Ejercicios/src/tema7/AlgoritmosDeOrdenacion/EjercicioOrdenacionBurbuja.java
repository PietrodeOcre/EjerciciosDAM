/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.AlgoritmosDeOrdenacion;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class EjercicioOrdenacionBurbuja {
    public static void main (String[] args){
        
        
        int[] numeros = new int [1000];
        int[] maximos = new int [10];
        
        Random r = new Random();
        
        alatorio(numeros);
        
        /*for(int x = 10; x<numeros.length; x++){
            for(int y=0; y<maximos.length; y++){
                if(numeros[x]>maximos[y]){
                    maximos[y]=numeros[x];
                    break;
                }
            }
        }*/
        
        ordena(numeros);
        maximo(maximos);
        
        System.out.println(Arrays.toString(numeros));
        System.out.print(Arrays.toString(maximos));
        
        
    }
    
    
    private static void ordena(int[] numero){
        int i, j, aux;
        for(i = 0; i<numero.length-1; i++){
            for(j=0; j<numero.length-i-1; j++){
                if(numero[j+1]<numero[j]){
                    aux=numero[j+1];
                    numero[j+1]=numero[j];
                    numero[j] = aux;
                }
            }
        }
    }
    
    private static void alatorio(int[] vector){
        Random r = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = r.nextInt(999);
  
        }
    }
    
    private static int[] maximo(int[] vector){
        int[] maximo = new int[10];
        int cont=0;
        for (int i=0; i<(vector.length);i++){
            if(i>990){
            maximo[cont] = vector[i];
            cont++;
            }
        }
        System.out.println(cont);
        return maximo;
    }
}
