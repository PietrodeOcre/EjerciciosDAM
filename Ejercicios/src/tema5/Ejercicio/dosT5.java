/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class dosT5 {
    /**
     */
    public static int velocidad;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("Elige una de estas 3 opciones");
            System.out.println("1 Ver velocidad");
            System.out.println("2 Acelerar");
            System.out.println("3 Frenar");
            int eligeOpcion;
            eligeOpcion = sc.nextInt();
            switch (eligeOpcion){
                case 1:
                    velocidad = velocidadActual(velocidad);
                    System.out.println("La velocidad es:  "+velocidad);
                break;
                case 2:
                    System.out.println("Acelera: ");
                    int mas = sc.nextInt();
                    velocidad = acelerar(mas);
                    System.out.println("Has aumentado la velocidad a:  "+velocidad);
                break;
                case 3:
                    System.out.println("Acelera: ");
                    int menos = sc.nextInt();
                    velocidad = frenar(menos);
                    System.out.println("Has frenado a la velocidad de:  "+velocidad);
                break;
                default:
                    System.out.print("La velocidad máxima es: "+velocidad);
                break;
            }
            
        }while(velocidad<=7);
        
        System.out.println("La velocidad es: "+velocidad);
    }
    
    public static int velocidadActual(int num){
        return velocidad;
    }
    
    public static int acelerar(int num){
        return velocidad+=num;
    }
    
    public static int frenar(int num){
        return velocidad-=num;
    }
    
}
