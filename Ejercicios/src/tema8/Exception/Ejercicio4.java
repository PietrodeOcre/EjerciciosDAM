/*
Crea una clase llamada MiExepcion que gestione excepciones. El constructor 
recibirá un código de error. Es necesario que sobrescriba el método 
“public String getMessage()” siguiendo la siguiente casuística:

    • Si el código de error es 111, el mensaje de error es “Error, el número está entre 0 y 10”.
    • Si el código de error es 222, el mensaje de error es “Error, el número está entre 11 y 20”.
    • Si el código de error es 333, el mensaje de error es “Error, el número está entre 21 y 30”.

Crea, además, una clase Main que lance una excepción de tipo Miexcepcion 
con el código 111 si el número tecleado por pantalla es entre 0 y 10, si 
el valor por teclado es entre 11 y 20 se lanza la excepción con código 222, 
y en caso de que el número sea entre 21 y 30 lance la excepción con el código 333. 
La propia clase capturará la excepción y escribirá por pantalla el mensaje del 
error (método implementado). Siempre se tendrá que escribir por pantalla 
el mensaje “Proceso finalizado” se lance una excepción o no se lance.
 */
package tema8.Exception;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
       
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        try{
            if(num>=0 && num<=10){
                throw new MiExcepcion(111);
                
            }
            if(num>=11 && num<=20){
                throw new MiExcepcion(222);
                
            }
            if(num>=21 && num<=30){
                throw new MiExcepcion(333);
                
            }
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Proceso finalizado.");
        }
        
        /*
        try{
            
            throw new MiExcepcion(pedirNum());
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Proceso finalizado");
        }
        */
        
    }
    
    private static int pedirNum(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe un número: ");
        int num = sc.nextInt();
        return num;
    }
}
