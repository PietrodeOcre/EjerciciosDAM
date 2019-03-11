/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.Ejercicio;


/*
Importamos una clase creada para introducir eneteros por teclado, creada por 
mi en la clase teclado que esta dentro del package ejerciciostema4, tiene dentro
un método para recojer el int desde el teclado y mostrarlo
*/
import static tema4.Ejercicio.teclado.teclado;
/**
 *
 * @author pietrodeocre
 */
public class doce {
    
    /*
    Creamos un parametro para realizar la introduccion desde teclado de un 
    numero entero int gracias a x=teclado(); pero x debe estar declarada como
    un int previamente.
    */
    int teclado = tema4.Ejercicio.teclado.teclado();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Definimos variables
        int a, b;
        // asignamos valores a las variables
        a=0;
        System.out.print("Dime el número de la tabla: ");
        b=teclado();
        //Definimos la condición
        while (a<=10){
            System.out.println(b +" * "+ a +" = "+ (b*a));
            ++a;
        }
    }
}
