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
public class dos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont = 1;
        while (cont<=10){
            Pares(cont);
            Impares(cont);
            cont++;
        }
    }
    
    public static void Pares(int cont){
        if(cont%2==0){
                System.out.println(cont);
            }
        
    }
    
    public static void Impares(int cont){
        if(cont%2!=0){
                System.out.println(cont);
            }
        
    }
}
