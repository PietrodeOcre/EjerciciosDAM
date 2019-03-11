/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Repaso;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class nueve {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero= new Scanner(System.in);
        int num=numero.nextInt();
        int aux=0;
            for (int i=1;i<=num;i++){
                aux=i;
                for (int j=0;j<i;j++){
                    System.out.print(aux);
                }
            System.out.println("");
        }
        
    }
}
