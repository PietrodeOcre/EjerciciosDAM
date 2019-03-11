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
    //Creamos un método para devolver el alfabeto
    private static char[] alfabeto(){
        //Primero lo hice a la vieja usanza, un array con el alfabeto
        char[] s = new char[26];/* = {'A','B','C','D','E','F','G','H','I','J','K',
            'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};*/
        //Descubrí que los char si les ponemos un número casteando a char 
        //nos muestra una letra, por su código numérico, con lo cual 
        //podemos generar el array automaticamente o no usar ni array.
        for (int i=0;i<26;i++){
            //Casteando a char un int para meterlo en su hueco del array
            s[i] = (char) ('A'+i);
        }
        //Devolvemos un array con el alfabeto completo 
        return s;
    }
    
    public static void main(String[]args){
        //Imprimo el array para comprobar
        //System.out.println(alfabeto());
        Scanner sc = new Scanner(System.in);
        //Creamos una variable para pedir el número de la posición del array
        int num;
        do{
            //System.out.println("Escribe un número: ");
            //Pedimos la posición del array
            num = Integer.parseInt(sc.nextLine());
            //Si está en el rango del array muestra la letra
            if (num>(-1) && num<26){
                System.out.println(alfabeto()[num]);
            }else{
                //De lo contrario obtienes un error
                System.out.println("Deben ser números del 0 al 25");
            }
            //Si el número introducido es -1 salimos del bucle
        } while (num != (-1)); 
    }
    
}
