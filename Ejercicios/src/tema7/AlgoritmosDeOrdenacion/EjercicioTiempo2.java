/*
 * crear un vector de 10000 posiciones con números aleatorios
Buscar posicion de un elemento recorriendo el vector compleo y medir tiempo
Ordenar vector y aplicar busqueda binaria al vector midiendo el tiempo.
 */
package tema7.AlgoritmosDeOrdenacion;

import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author pietrodeocre
 */
public class EjercicioTiempo2 {
    
    public static void main (String[]args){
        
        int[] numeros = new int [100000];
        alatorio(numeros);
        
        mostrar(numeros);
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Escribe el número a buscar: ");
        int numer = sc.nextInt();
        
        long tiempoInicial = System.currentTimeMillis();
        
        System.out.println(busquedaSecuencial(numeros, numer));
        
        long tiempoFinal = System.currentTimeMillis();
        
        System.out.println("El tiempo ha sido: "+((tiempoFinal-tiempoInicial)) + "ms");
        
        tiempoInicial = System.currentTimeMillis();
        
        ordena(numeros);
        
        System.out.println(busquedaBinaria(numeros, 0, numeros.length-1, numer));
        
        tiempoFinal = System.currentTimeMillis();
        
        System.out.println("El tiempo ha sido: "+((tiempoFinal-tiempoInicial)) + "ms");
        
    }
    
    private static void alatorio(int[] vector){
        Random r = new Random();
        for(int i=0; i<vector.length; i++){
            vector[i] = r.nextInt(999);
  
        }
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
    
    private static int busquedaBinaria(int []vector,
    		int posInicial, int posFinal, int elemento) {
    	
    	if (posInicial>=0 && posInicial<=posFinal &&
    			posFinal>=0) {
    		int mitad = ((posFinal - posInicial)/2) +posInicial;
    		
    		if (vector[mitad] > elemento) {
    			return busquedaBinaria(
    					vector, posInicial, mitad-1, elemento);
    			
    		}
    		else if (vector[mitad] < elemento) {
    			return busquedaBinaria(
    					vector, mitad+1, posFinal, elemento);
    			
    		}
    		else {
    			return vector[mitad];
    		}
    		   		
    	}	
    	return -1;
    }
    
    private static int busquedaSecuencial(int []vector,int dato){
        int posicion = -1;
         for(int i = 0; i < vector.length; i++){//recorremos todo el arreglo
             if(vector[i] == dato){//comparamos el elemento en el arreglo con el buscado
           posicion = i;//Si es verdadero guardamos la posicion
           return posicion;
           //break;//Para el ciclo
          }
        }
        return posicion;
    }
    
    //Mostramos el tablero completo
    public static void mostrar(int[] tablero){
        //Recorremos las filas

        for (int i=0; i<tablero.length; i++){
            //Recorremos las columnas
            //for (int j=0;j<tablero[i].length; j++){
                //Mostramos la posicion del tablero
                System.out.println(tablero[i]+" "+tablero[++i] +" "
                        +" "+tablero[++i]+" "+tablero[++i]+" "+tablero[++i]
                        
                        );
 
            //}
            //Dejamos un salto de linea para mostrar de tres en tres todo el tablero
            //System.out.println("");
        }
    }
}
