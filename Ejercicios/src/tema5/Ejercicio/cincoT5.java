/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;


import static tema5.Ejercicio.tresT5.Imprime;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class cincoT5 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        KilosProductos productos = new KilosProductos();
        Imprime("Escribe los kilos de papas:  ");
        KilosProductos.kilosPapa = sc.nextInt();
        Imprime("Escribe los kilos de chocos:  ");
        KilosProductos.kilosChocos = sc.nextInt();
        System.out.println("Tienes Papas para "+productos.damePapas(KilosProductos.kilosPapa)+" personas");
	System.out.println("Tienes Papas para "+productos.dameChocos(KilosProductos.kilosChocos)+" personas");
        int elige;
        do{
            System.out.println("Quieres añadir un producto?");
            System.out.println("1 para papas");
            System.out.println("2 para chocos");
            System.out.println("3 Ver total papas");
            System.out.println("4 Ver total chocos");
            System.out.println("5 Comensales");
            System.out.println("0 Salir");
            System.out.print("Elige opción: ");
            elige = sc.nextInt();
            if (elige==1) {
                int sumaPapas = sc.nextInt();
                productos.masPapas(sumaPapas);
                System.out.println("Ahora hay "+ KilosProductos.kilosPapa + " kilos de Papas");
            }else if(elige==2){
                int sumaChocos = sc.nextInt();
                productos.masChocos(sumaChocos);
                System.out.println("Ahora hay "+ KilosProductos.kilosChocos + " kilos de Chocos");
            }else if(elige==3){
                productos.showPapas();
            }else if(elige==4){
                productos.showChocos();    
            }else if(elige==5){
                productos.getComensales();
            }else if(elige==6){
                elige=0;
            }
        
        }while(elige!=0);
    }
    
    
}

