/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjerciciosDos.EjercicioSeis;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[]args){
        //Scanner sc = new Scanner(System.in);
        
        Empleado empleado1 = new Empleado();
        Empleado empleado2 = null;
        Empleado empleado3 = new Empleado();
        Empleado empleado4 = new Empleado();
        Empleado empleado5 = new Empleado();
        Empleado empleado6 = new Empleado(empleado5);
        
        Empleado empleado[] = new Empleado[5];
        
        /*for (int i=0; i<empleado.length; i++){
            System.out.println("Escribe el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Escribe el edad: ");
            int edad = sc.nextInt();
            System.out.println("Escribe el sexo: ");
            char sexo = sc.next().charAt(0);
            System.out.println("Escribe el número de S.S.: ");
            long ss = sc.nextLong();
            sc.nextLine();
            empleado[i] = new Empleado(nombre,edad,sexo,ss);
            
        }*/
        
        try {
        empleado2 = (Empleado)empleado1.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        /*for (int x=0; x<empleado.length; x++){
            System.out.println(empleado[x]);
        }*/
        
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);
        System.out.println(empleado4);
        System.out.println(empleado5);
        System.out.println(empleado6);
    }
}
