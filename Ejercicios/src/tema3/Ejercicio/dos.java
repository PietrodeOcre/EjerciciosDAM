/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.Ejercicio;

/**
 *
 * @author pietrodeocre
 */
public class dos {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaramos las variables
        int x, y;
        double n, m;
        
        // Le damos un valor
        x = 4;
        y = 4;
        n = 1.6;
        m = 4.6;
        
        // Mostramos las operaciones
        System.out.println("La suma de "+ x +"+"+ y +" es igual a " + (x+y));
        System.out.println("La resta de "+ x +"-"+ y +" es igual a " + (x-y));
        System.out.println("La multiplicación de "+ x +"*"+ y +" es igual a " + (x*y));
        System.out.println("La división de "+ x +"/"+ y +" es igual a " + (x/y));
        System.out.println("El resto de "+ x +"%"+ y +" es igual a " + (x%y));
        System.out.println("La suma de "+ n +"+"+ m +" es igual a " + (n+m));
        System.out.println("La resta de "+ n +"-"+ m +" es igual a " + (n-m));
        System.out.println("La multiplicación de "+ n +"*"+ m +" es igual a " + (n*m));
        System.out.println("La división de "+ n +"/"+ m +" es igual a " + (n/m));
        System.out.println("El resto de "+ n +"%"+ m +" es igual a " + (n%m));
        System.out.println("La suma de "+ x +"+"+ m +" es igual a " + (x+m));
        System.out.println("La división de "+ y +"/"+ m +" es igual a " + (y/m));
        System.out.println("El resto de "+ y +"%"+ m +" es igual a " + (y%m));
        System.out.println("El doble de x es "+(x*2));
        System.out.println("El doble de y es "+(y*2));
        System.out.println("El doble de n es "+(n*2));
        System.out.println("El doble de m es "+(m*2));
        System.out.println("La suma de todas las variables es "+(x+y+n+m));
        System.out.println("La multiplicación de todas las variables es "+(x*y*n*m));
    }
    
}
