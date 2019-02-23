/*
 * Este programa pide 5 números
 * y nos indica cual de ellos es 
 * Múltiple de tres.
 */
package tema4.EjercicioWhile;

//Importamos Scanner
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class veintinueve {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Objeto teclado
        Scanner sc = new Scanner(System.in);
        //Definimos las variables
        int cont;
        cont = 0;
        //Creamso el bucle
        do{
            System.out.println("Escribe un número: ");
	  //Preguntamos el número
            int multiplodetres = sc.nextInt();
            if (multiplodetres%3 == 0){ //Si el número dividido por 3 tiene resto 0, es múltiplo
                System.out.println("Este un número: "+multiplodetres+", es múltiplo de tres.");
            }
            cont++;
        }while (cont<5);
    }
}