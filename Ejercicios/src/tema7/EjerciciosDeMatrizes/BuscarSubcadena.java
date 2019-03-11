/*
 * Realizar un método que a partir de una cadena obtenga cuantas sub 
 * cadenas de un tipo concreto que le damos tambien tiene dicha cadena
 * cadena = HolajolaU
 * Subcadena = ola
 * 2 subcadenas contenidas en cadena. 
 */
package tema7.EjerciciosDeMatrizes;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class BuscarSubcadena {
    public static void main (String[]args){
        Scanner sc =  new Scanner(System.in);
        
        String frase = sc.nextLine();
        frase =frase.trim();
        
        String subfrase = sc.nextLine();
        subfrase =subfrase.trim();
        
       
        
        System.out.println(buscarCadena(frase,subfrase));
        
    }
    
    private static int buscarCadena(String cadena, String subcadena){

        int cont = 0, indice = 0;
        
        //Devuelve -1 cuando no encuentra la subcadena 
        while((indice = cadena.indexOf(subcadena, indice)) != -1) {
            
            //Creamos una subcadena desde la siguiente posicion a 
            //la cadena encontrada anteriormente
            indice += subcadena.length() - 1;
            cont++;
        }
        //Retorna el número de veces que se repite subcadena en cadena.
        return cont;
    }
}
