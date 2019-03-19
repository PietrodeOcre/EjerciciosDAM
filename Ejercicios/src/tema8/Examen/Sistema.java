/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

import java.util.Random;

/**
 *
 * @author pietrodeocre
 */
public class Sistema {
    
    public static int aleatorio(){
        Random rd = new Random();
        
        int num = rd.nextInt(9)+1;
        
        return num;
    }
    
    public static void main(String[] args)throws IndexOutOfBoundsException {
        
        int num = aleatorio();
        
        if (num < 5){
            try{
                menorQueCinco();
                System.out.println(num);
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
            }
            
        }else if(num>=5){
            menorQueCinco();
            System.out.println(num);
        }
        
    }
    
    public static void menorQueCinco(){
        throw new NumberFormatException();
    }
    
    public static void mayorQueCinco()throws IndexOutOfBoundsException{
        throw new IndexOutOfBoundsException();
    }
    
}
