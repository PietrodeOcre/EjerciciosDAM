/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;

import java.util.*;
/**
 *
 * @author pietrodeocre
 */
public class ochoSegunda {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int alumnos;
	int contador;
	int nota;
	double nota1;
	double nota2;
	System.out.println("Indique el número de alumnos:");
	alumnos = sc.nextInt();
	contador = 1;
	while (contador<=alumnos) {
            System.out.println("Escribe la primera nota del alumno "+contador);
            nota1 = sc.nextDouble();
            System.out.println("Escribe la segunda nota:");
            nota2 = sc.nextDouble();
            System.out.println("La nota del alumno "+contador+" es "+((nota1*0.6)+(nota2*0.4)));
            ++contador;
        }
    }
}
