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
public class Battle {
    public static void main(String[] args) {
        for (int x = 0; x < 5; x++) {
            try{
                System.out.println("t_");
                checkIt(x);
                System.out.println("t2_");
            }finally{
                System.out.println("f_");
            }
            
        }
    }
    public static void checkIt(int a){
        if(a==1)
            throw new IllegalArgumentException();
    }
    
    //t_t2_f_t_
}
