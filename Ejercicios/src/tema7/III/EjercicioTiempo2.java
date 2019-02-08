/*
 * crear un vector de 10000 posiciones con números aleatorios
Buscar posicion de un elemento recorriendo el vector compleo y medir tiempo
Ordenar vector y aplicar busqueda binaria al vector midiendo el tiempo.
 */
package tema7.III;

import java.util.Random;


/**
 *
 * @author pietrodeocre
 */
public class EjercicioTiempo2 {
    
    public static void main (String[]args){
        
        int[] numeros = new int [10000];
        alatorio(numeros);
        
        long tiempoInicial = System.currentTimeMillis();
        
        busquedaSecuencial(numeros, 5000);
        
        long tiempoFinal = System.currentTimeMillis();
        
        System.out.println("El tiempo ha sido: "+((tiempoFinal-tiempoInicial)/1000) + "s");
        
        ordena(numeros);
        
        tiempoInicial = System.currentTimeMillis();
        
        busquedaBinaria(numeros, 0, 10000-1,5000);
        
        tiempoFinal = System.currentTimeMillis();
        
        System.out.println("El tiempo ha sido: "+((tiempoFinal-tiempoInicial)/1000) + "s");
        
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
           break;//Para el ciclo
          }
        }
        return posicion;
    }
    
}
