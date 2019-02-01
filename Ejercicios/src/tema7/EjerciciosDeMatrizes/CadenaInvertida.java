/*
 * un usuario introduce por teclado una cadena, por ejemplo "Hola" y 
el sistema escribe por pantalla la cadena "HolaloH".
Si se escribe "Casa" devuelve "CasasaC"
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class CadenaInvertida {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        
        String frase = sc.nextLine();
        frase =frase.trim();
        int contador=0;
        String fraseDos = "";
        for(int i=(frase.length())-2; i>=0; i--){
            char caracter = frase.charAt(i);
            fraseDos += caracter;
        }
        System.out.println("La cadena '"+frase+"' despues del método es "+frase+fraseDos+".");
    }
}
