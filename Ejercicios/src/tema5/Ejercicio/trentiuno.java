/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Ejercicio;

import java.util.Scanner;

/*
 * @author pietrodeocre
 */
public class trentiuno {
    
    public static int iteracion, suma;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un número: ");
        iteracion = sc.nextInt();
        iniciar(iteracion);
        System.out.println("Números Primos:"+suma);
    }
    
    public static void iniciar(int limite){
	for(int i=2;i<=limite;i++){
            if(esPrimo(i)){
                System.out.println(i);
                suma++;
            }
        }
    }

    public static boolean esPrimo(int numero){
	int aux;
	for(int cont=2;cont<numero;cont++){
            aux=numero%cont;
            if(aux==0)
                return false;
        }
	return numero != 1;
    }
}
