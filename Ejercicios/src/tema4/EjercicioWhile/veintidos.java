/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class veintidos {

    /**
     * @param args the command line arguments
     */
    
    private static int cont, mediaEdad, mediaEstatura, mayor18, masEstatura, edad, estatura;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        do{
            System.out.print("Escribe la edad del alumno: ");
            edad = sc.nextInt();
            System.out.print("Escribe la estatura del alumno en cm: ");
            estatura = sc.nextInt();
            mediaEdad=mediaEdad+edad;
            mediaEstatura=mediaEstatura+estatura;
            if(edad>18){
                ++mayor18;
            }
            if(estatura>175){
                ++masEstatura;
            }
            cont++;
        }while(cont<=5);
        System.out.println("Edad media: "+(mediaEdad/5)+" años");
        System.out.println("Estatura media: "+(mediaEstatura/5)+" centímetros");
        System.out.println("Alumnos de más de 18: "+mayor18);
        System.out.println("Alumnos más altos de 1,75: "+masEstatura);
    }
}
