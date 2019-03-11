/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class primos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        int contprimos=0;
        int cont=0;
        num = sc.nextInt();
        boolean divisible= false;
        
        
        for (int i=num; i>1; i--){
            boolean esPrimo = esPrimo(i);
            if (esPrimo){
                contprimos++;
                System.out.println(contprimos);
            }
        }
        
        
        
    }
    //Si es estatic se le puede llamar desde otra clase
    // nombreClase.nombreMetodo(parametro);
    //Si no es estatic debemos crear un objeto de la clase
    //nombreClase nombreObjeto = new nombreClase();
    //nombreObjeto.nombreMetodo(parametro);
    //Void en el metodo cuando no queremos que devuelva nada.
    //Si el método tiene un tipo tiene que tener return obligatoriamente.
    
    public static boolean esPrimo(int numero){
        boolean esPrimo=false;
        for (int c=(numero-1);c>1;c--){
            if(numero%c==0){
                esPrimo=false;
                break;
            }
        }
        return true;
    }
}
