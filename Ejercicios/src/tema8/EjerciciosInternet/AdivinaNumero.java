/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.EjerciciosInternet;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class AdivinaNumero {
    
    private static int generaNumero(){
        
        Random rd = new Random();
        int num = rd.nextInt(499)+1;
        return num;
        
    }
    
    private static int pideNumero(){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número: ");
        int num =  sc.nextInt();
        
        return num;
        
    }
    
    public static void main(String[] args) throws InputMismatchException {
        
        int numeroAdivinar = generaNumero();
        int numeroDado = 0;
        int cont=0;
        
        do{
            
            try{
                numeroDado = pideNumero();
                if(numeroDado>numeroAdivinar){
                    System.out.println("El número es menor que "+numeroDado);
                    cont++;
                }else {
                    System.out.println("El número es mayor que "+numeroDado);
                    cont++;
                }
            }catch(InputMismatchException e){
                cont++;
                System.out.println("Error, el dato debe ser un número." + e.getMessage());
                
            }
            
            
        }while(numeroDado!=numeroAdivinar);
        cont++;
        System.out.println("Adivinaste el número en " + cont+ " intentos! el número es: "+ numeroAdivinar);
        
        
    }
    
}
