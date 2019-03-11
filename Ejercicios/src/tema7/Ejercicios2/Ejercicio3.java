/*
 * Esta clase crea la letra de un DNI introducido por teclado
 */
package tema7.Ejercicios2;
//Impportamos Scanner para entrada de datos por teclado
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3 {
    //Creamos un array constante con todas las letras posibles
    private static final char[] LETRA = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    
    /*
    * El método recive un número, lo divide entre 23 y el resto, correspondiente 
    * a la posicion de un caracter en el array LETRA, lo cual retorna.
    */
    public static char getLetraDni(int numDni) {
	return LETRA[numDni%23];
    }
    
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //Pedimos el número por teclado
        System.out.println("Escribe el número de dni: ");
        //Para comprobar que no es un String lo que envian 
        try {
            //Al recivir el número lo convertimos a String
            Integer numDni = Integer.parseInt(sc.nextLine());
            
            //Imprimimos el número convertido más la letra que devuelve el método 
            System.out.println("El DNI con letra es: " + numDni + "-" + getLetraDni(numDni));
        }catch(NumberFormatException e){
            //Mostramos que es un error
            System.out.println("Error. Solo números!");
        }

    } 
}
