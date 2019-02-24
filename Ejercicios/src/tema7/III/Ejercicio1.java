/*
 * Tenemos una cadena de notas con los nombres y las notas de 5 de los 
 * alumnos de clase. El contenido de la cadena es el siguiente:
 * “Juan Carlos\n 8.5\n Andrés\n 4.9\nPedro\n 3.8\n Juan\n 6.3”
 * El formato es “nombre \n nota \n...”Realiza un programa que 
 * muestre por pantalla por cada alumno lo siguiente:El alumno 
 * X ha sacado la nota Y.
 */
package tema7.III;

import java.util.StringTokenizer;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    public static void main (String[] args){
        StringTokenizer str = new StringTokenizer("Juan Carlos\n 8.5\n Andrés\n 4.9\nPedro\n 3.8\n Juan\n 6.3" , "\n");
        
        String token = null;
        
        
        while (str.hasMoreTokens()){
            
            token = str.nextToken();
            System.out.println("El alumno "+ token + " ha sacado la nota " + str.nextElement());
            
            
        }
        profesor();
        
    }
    
    private static void profesor(){
        StringTokenizer str = new StringTokenizer("Juan Carlos\n 8.5\n Andrés\n 4.9\nPedro\n 3.8\n Juan\n 6.3" , "\n");
        while (str.hasMoreTokens()){
            System.out.println("El alumno "+ str.nextToken() + " ha sacado la nota " + str.nextToken());                   
        }
    }
}
