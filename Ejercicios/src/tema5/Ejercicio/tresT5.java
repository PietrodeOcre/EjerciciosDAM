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
public class tresT5 {
    
    public static String cadena;
    public static void main(String[] args) {
        // TODO code application logic here
        tresT5 objeto=new tresT5();
        /*Creando el objeto para poder llamarlo 
            desde el main o desde otra clase si el método que llamo no es
            static.
        */
        Scanner sc = new Scanner(System.in);
        ImprimeSalto("Descubre el porcentaje de descuento. ");
        Imprime("Escribe el precio:  ");
        double precio = sc.nextDouble();
        Imprime("Escribe el preciodespues del descuento:  ");
        double precioRebajado = sc.nextDouble();
        ImprimeSalto("El descuento es: "+ objeto.tuDescuento(precio, precioRebajado)+"%");
        /* 
        El objeto creado anteriormente es llamado para ejecutar ese metodo, no 
        importa si el metodo es de esta propia clase o de otra, la diferencia 
        solo es que hay que hacer un import si es desde otra clase.
        */
        
    }
    
    public static void Imprime(String cadena){
        System.out.print(cadena);
    }
    
    public static void ImprimeSalto(String cadena){
        System.out.println(cadena);
    }
    
    /* public static double tuDescuento(double precio, double precioDespues){
        double descuento=100-(100*precioDespues/precio);
        return descuento;
    }*/
    
    public double tuDescuento(double precioAntes, double precioDespues){
        double descuento=100-(100*precioDespues/precioAntes);
        System.out.println("El descuento es: "+ descuento +"%");
        return descuento;
    }
}
