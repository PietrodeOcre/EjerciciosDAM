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
public class unoT5 {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe 1 para pasar Cº a Fº");
        System.out.println("Escribe 2 para pasar Fº a Cº");
        System.out.print("Elige una opción: ");
        int eleccion;
        eleccion = sc.nextInt();
        switch (eleccion){
            case 1:
                System.out.println("Escribe los grados Celsius: ");
                double celsius;
                celsius = sc.nextDouble();
                System.out.println("Los Farenheit son: "+centrigradosAFarenheit(celsius));
            break;
            case 2:
                System.out.println("Escribe los grados Farenheit: ");
                double farenheit;
                farenheit = sc.nextDouble();
                System.out.println("Los Celsius son: "+farenheitACentigrados(farenheit));
            break;
            default:
                System.out.println("Solo se pueden escribir 1 ó 2.");
            break;
        }
    }
    public static double centrigradosAFarenheit(double num){
        double respuesta;
	respuesta = (1.8)*num+32;
	return respuesta;
    }
    public static double farenheitACentigrados(double num){
        double respuesta;
	respuesta = (num-32)/1.8;
	return respuesta;    }
    
}
