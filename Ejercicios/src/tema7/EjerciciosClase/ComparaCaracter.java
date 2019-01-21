/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.EjerciciosClase;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class ComparaCaracter {
    
    //Este método compara elementos del array (si dos son iguales)=true
    private static boolean compara1(char[] comp){
        for(int i=0; i<comp.length; i++){
            for (int j=i+1; j<comp.length; j++){
                
                    if (comp[i] == comp[j]){
                        return true;
                    }
                    
                
            }
        }
        return false;
    }
    
    //Este método compara elementos del array (si tres son iguales)=true
    private static boolean compara(char[] comp){
        for(int i=0; i<comp.length; i++){
            for (int j=i+1; j<comp.length; j++){
                for (int x=j+1; x<comp.length; x++){
                    if (comp[i] == comp[j] && comp[j] == comp[x]){
                        return true;
                    }
                    
                }
            }
        }
        return false;
    }
    
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //creamos array de char
        char[] caract = new char[4];
          
        int i = 0;
        
        //Creamos bucle para introducir por teclado
        while (i<4){
            System.out.println("Escribe una letra: ");
            //Pedimos un array
            String cadena = sc.nextLine();
            try{
                //Si la primera posición del String puede pasar a entero
                //Da error y pasamos al catch
                Integer entero = Integer.parseInt(cadena.substring(0, 1));
                //Mostramos mensaje de error y no cuenta en la inserción del array
                System.out.println("Solo cadenas de caracteres!");
            }catch (NumberFormatException e){
                //Si salta el error es por que es una letra y la metemos al array
                caract[i] = cadena.charAt(0);
                //Aqui aumentamos el contador del While
                i++;
            }
        }
        
        //Mostramos por pantalla la repsuesta del método de comparación
        System.out.println("Esto es " + ((compara(caract))?"true!":"false!"));
        
       
     }
    
}
