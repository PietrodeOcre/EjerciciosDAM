/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Repaso;

/**
 *
 * @author pietrodeocre
 */
public class BuclesWhile {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=0, j;
        
        while(i<=5){
            j=1;
            while(j<8){
                System.out.println("i"+i+",j:"+j);
                j++;
            }
            i++;
        }
        
        
    }
    
}
