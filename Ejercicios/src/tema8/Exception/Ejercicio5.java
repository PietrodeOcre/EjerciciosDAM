/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Exception;

/**
 *
 * @author pietrodeocre
 */
public class Ejercicio5 extends Exception{
    
    public static void main(String[] args) {
        
        int[] a = {1,2,3};
        
        try{
            metodoA(a);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error. ArrayIndexOutOfBoundsException->"+e.getMessage());
        }catch(IndexOutOfBoundsException e){
            System.out.println("Error. IndexOutOfBoundsException->"+e.getMessage()); 
        }catch(Exception e){
            System.out.println("Error. Exception->"+e.getMessage());
        
        }
        
    }
    
    private static void metodoA(int[] a) throws IndexOutOfBoundsException{
        
        a[3] = 3;
        
        
        
    }
    
}
