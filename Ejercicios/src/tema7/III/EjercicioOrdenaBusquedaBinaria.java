package tema7.III;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pietrodeocre
 */
public class EjercicioOrdenaBusquedaBinaria {
    
    public static void main(String[]args){
        
        int[] numeros = new int [1000];
        alatorio(numeros);
        
        ordena(numeros);
        
        System.out.println(busquedaBinaria(numeros, 0, 1000, 37));
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
    
    //Para busqueda binaria tiene que estar ordenada la secuencia para que sea mas efectiva
    private static int busquedaBinaria(int[] vector, int posInicial, int posFinal, int elemento){
        if (posInicial>=0 && posInicial<=posFinal && posFinal>=0){
            int mitad = (posFinal - posInicial)/2;
            if(vector[mitad]>elemento){
                return busquedaBinaria(vector, posInicial, mitad-1, elemento);
            }else if(vector[mitad]<elemento){
                return busquedaBinaria(vector, mitad+1, posFinal, elemento);
            }else{
                return vector[mitad];
            }
        }
        return -1; //Significa que no ha encontrado el elemento
    }
}
