/*
Implemente un programa que lea un número ‘a’ y otro número ‘b’ y luego 
calcule “a/b”. Pruebe a introducir b=0 y ver que hace el programa con la 
división por cero. Pruebe a introducir b=”Carlos” para ver como se comporta 
el programa. Añada excepciones para recoger estas excepciones y avisar del 
problema al usuario, imprimiendo la información mediante getMessage y 
printStackTrace. Incluya un bucle que vuelva a pedir los datos ‘a’ y ‘b’ al 
usuario hasta que introduzca dos datos válidos.
 */
package tema8.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    private static void divide (int a, int b){
       
            System.out.println(a/b);
       
    }
    
    private static int[] pideNum (int[] num){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe el primero número: ");
            num[0] = sc.nextInt();
            System.out.println("Escribe el segundo número: ");
            num[1] = sc.nextInt();
        }catch(InputMismatchException excepcion){
            System.out.println(" No se admiten letras. " + excepcion.getMessage());
        }
        return num;
    }
    
    public static void main(String[] args) throws InputMismatchException{
        
        Scanner sc = new Scanner(System.in);
        int a,b = 0;
        
        /*try{
            divide(3,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
            
            e.printStackTrace();
        }
        
        //divide(3,"carlos");
        
        try{
            //divide(3,"carlos");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            
            e.printStackTrace();
        }*/
        
        
         int[] num = new int[2];
            while (num[1] == 0){
                
            
                try{
                    pideNum(num);
                    divide(num[0],num[1]);
                    
                }catch(ArithmeticException excepcion){    
                    System.out.println(" Error de división por cero. " + excepcion.getMessage());
                }
            }
        
        
        
    }
        
   
    
}
