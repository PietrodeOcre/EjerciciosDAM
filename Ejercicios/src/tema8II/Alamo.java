/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8II;

/**
 *
 * @author pietrodeocre
 */
public class Alamo {
    public static void main(String[] args) {
        try{
            System.out.println("M");
        }catch(Error e){
            System.out.println("ae_");
        }finally{
            try{
                throw new IllegalArgumentException();
            }catch(Exception e2){
                System.out.println("ae2_");
            }finally{
                System.out.println("finaliza");
            }
            
        }
        
    }
}
