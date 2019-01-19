/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.Ejercicios2;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    private static char[] alfabeto(){
        
        char[] s = new char[26];/* = {'A','B','C','D','E','F','G','H','I','J','K',
            'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};*/
        
        for (int i=0;i<26;i++){
            s[i] = (char) ('A'+i);
        }
        
        return s;
    }
    
    public static void main(String[]args){
        System.out.println(alfabeto());
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.println("Escribe un número: ");
            num = Integer.parseInt(sc.nextLine());
            if (num>(-1) && num<26){
            System.out.println(alfabeto()[num]);
            }else{
                System.out.println("Deben ser números del 0 al 25");
            }
            
        } while (num != (-1)); 
    }
    
}
