/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Ejercicio1;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio3Array {
    private static final int POS = 20;
    public static void main(String[]args){
        
        //Scanner sc = new Scanner(System.in);
        int[] numero;
        
        numero = new int[POS];
        
        
        //impares(numero);
        //paresSalteados(numero);
        leerVectorDos(numero);
        muestra(numero);
        
        
    }
    
    private static void impares(int[] numero){

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numero.length; i++){
            System.out.print("Escribe un número: ");
            int num = sc.nextInt();
            
            if (num%2!=0){
                numero[i] = num;
            }
            
            
            System.out.println("");
        }
    }
    
    private static void paresSalteados(int[] numero){

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numero.length;i++){
            System.out.print("Escribe un número: ");
            int num = sc.nextInt();
            
            if (i<=20){
                if(i%2==0){
                    numero[i] = num;
                }
            }            
            if (i==20){
                break;
            }
            
            System.out.println("");
            ++i;
        }
    }
    
    private static void leerVector(int[] vector){
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=-2; i<vector.length; i++){
            String str = sc.nextLine();
            try {
                Integer entero = Integer.parseInt(str);
                vector[contador] = entero;
                contador = contador+2;
            } catch (NumberFormatException e) {
                System.out.println("No puedo procesar cadenas.");
            }
        }
    }
    
    private static void leerVectorDos(int[] numero){
        int contador = 0;
        int i = 0;
        Scanner sc = new Scanner(System.in);
        while (i<POS){
            String str = sc.nextLine();
            try {
                Integer entero = Integer.parseInt(str);
                numero[contador] = entero;
                contador = contador+2;
                if (contador>=POS){
                    break;
                }
                
                i++;
            } catch (NumberFormatException e) {
                System.out.println("No puedo procesar cadenas.");
            }
        }
    }
    
    private static void muestra(int[] numero){
        
        for (int x=0; x<POS; x++){
            System.out.println(x + "->" + numero[x]);
        }
    }
    
    
    
}
