/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7.HojaDos;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class Ejercicio1 {
    
    public static void main (String[] args){
        
        double[] array = crearArrayUsuario();
        double media = calculaMediaVector(array);
    }
    
    private static double[] crearArrayUsuario(){
        Scanner sc = new Scanner(System.in);
        int tamanio = sc.nextInt();
        double[] array = null;
        array = new double[tamanio];
        double numeroDecimal = 0;
        int indice = 0;
            do{
                numeroDecimal = sc.nextDouble();
                if (numeroDecimal != -1){
                    array[indice] = numeroDecimal;
                    indice++;
                }
            }while(numeroDecimal !=-1 && indice < tamanio);
        return array;
    }
    
    private static double calculaMediaVector(double[] vector){
        int numeroSumas = 0;
        double sumaElementos =0;
        for (int i=0; i<vector.length; i++){
            if(vector[i] != 0){
                sumaElementos = sumaElementos + vector[i];
            }
            
        }
        return sumaElementos/vector.length;
    }
    
   
}
