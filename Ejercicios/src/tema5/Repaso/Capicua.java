/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Repaso;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Capicua {
    /**
     */
    public static int num;
    //public static boolean capicua;
    //public static int num, decenaMillar, millar, centena, decena, unidad;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cont;
        
        do{
            System.out.print("Escribe un número de 5 cifras: ");
            num = sc.nextInt();
            if (num<10000 || num>99999){
                System.out.println("El número debe ser de al menos 5 cifras");
            }
        }while(num<10000 || num>99999);
        System.out.println("¿El número "+num+" es capicua? "+((Descompuesto(num))?" Verdadero":" Falso"));
        /*System.out.println("Decena de Millar: "+ decenaMillar);
        System.out.println("Millar: "+ millar);
        System.out.println("Centena: "+ centena);
        System.out.println("Decenas: "+ decena);
        System.out.println("Unidades: "+ unidad);*/
    }
    
    public static boolean Descompuesto(int num){
        boolean capicua;
        int decenaMillar, millar, centena, decena, unidad;
        decenaMillar= num/10000;
        millar = (num/1000)-(decenaMillar*10);
        centena = (num/100)-(decenaMillar*100)-(millar*10);
        decena = (num/10)-(decenaMillar*1000)-(millar*100)-(centena*10);
        unidad = (num%10);
        if(millar==decena && decenaMillar == unidad){
           return capicua=true;
        }else{
           return capicua=false;
        } 
    }
}
