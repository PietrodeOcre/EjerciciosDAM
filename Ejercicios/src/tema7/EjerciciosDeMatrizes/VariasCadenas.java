/*
 * Introducimos varias cadenas hasta que el usuario introduce el -1
 * al poner -1 deja de grabar cadenas y termina el programa.
 * crea un vector de cadenas para guardarlas todas y crear otro 
 * método para invertir todas las cadenas del vector.
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class VariasCadenas {
    
    

    public static void main (String [] args){
        
        String[] vectorCadena = new String[5];
        //Rellenamos cadenas en nuestro vector
        System.out.println(Arrays.toString(pedirCadena(vectorCadena)));
        
        
        mostrar(vectorCadena);
    }
    
    private static void mostrar(String[] vector){
        for (int i= 0; i<(vector.length)-1; i++){
            System.out.println(invertir(vector[i]));
        }
        
    }
    
    private static String[] pedirCadena(String[] vectorCadena1){
        Scanner sc = new Scanner(System.in);
        int num = vectorCadena1.length-1;
        for (int i=0; i<num; i++){
            String cadena = sc.nextLine();
            if (!"-1".equals(cadena)){
                vectorCadena1[i] = cadena;
            } 
        }
        return vectorCadena1;
    }
    
    private static String invertir(String frase){
        //Creamos un String para 
        String fraseDos = "";
        for(int i=(frase.length()-1); i>=0; i--){
            char caracter = frase.charAt(i);
            fraseDos += caracter;
        }
        return fraseDos;
    }
    
    
}
