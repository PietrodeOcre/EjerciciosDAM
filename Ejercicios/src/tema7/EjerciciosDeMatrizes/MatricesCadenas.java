/*
 * Recive una cadena y contar caracteres que sean vocales
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class MatricesCadenas {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        
        String frase = sc.nextLine();
        frase =frase.trim();
        int contador=0;
        
        for(int i=0; i<frase.length(); i++){
            char caracter = frase.charAt(i);
            if (caracter == 'o' || caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'u'){
                contador++;
                
            }
        }
        System.out.println("La cadena '"+frase+"' tiene "+contador+" caracteres.");
    }
}
