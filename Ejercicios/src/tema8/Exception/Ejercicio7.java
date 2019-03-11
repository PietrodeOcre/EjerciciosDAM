/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int option=0;
        
        do{
            try{
                mostrarOpciones();

                option = sc.nextInt();

                if(option!=1 && option!=2 && option !=2){
                    throw new ExcepcionEjercicio7(option);
                }
                    

            }catch(InputMismatchException e){
                System.out.println(e.getMessage());
            }catch (ExcepcionEjercicio7 e){
                System.out.println(e.getMessage());
            }
        }while(option!=0);
    }

    private static void mostrarOpciones() {
        System.out.println("1. Opción 1");
        System.out.println("2. Opción 2");
        System.out.println("3. Opción 3");
        System.out.println("0. Salir");
    }
    
}
