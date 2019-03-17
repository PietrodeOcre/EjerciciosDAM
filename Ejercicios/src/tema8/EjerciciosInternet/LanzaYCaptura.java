/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.EjerciciosInternet;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class LanzaYCaptura {
    
    public static void main(String[] args) throws masError{
        
        try{
            
            throw new Exception("Error");
            
        }catch(Exception e){
            
            System.out.println(e.getMessage());
        }
        
        try{
            
            provocaError();
            
        }catch ( Exception e){
            
            System.out.println(e.getMessage());
            
        }
        
        provocaError2();
        
    }
    
    private static void provocaError() throws Exception{
        
        throw new Exception("Otro error.");
        
    }
    
    private static void provocaError2()throws masError{
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe el codigo de error 10, 20 ó 30: ");
        int num = sc.nextByte();
        try{
            throw new masError(num);
        }catch(masError e){
            System.out.println(e.getMessage());
        }
                
            
        
    }
    
}
