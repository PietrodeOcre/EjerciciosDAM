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
public class seis {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont=1;
        seis multi = new seis();
        while(cont<=100){
            multi.multiploDeCinco(cont);
            cont++;
        }
    }
    
    
    public void multiploDeCinco(int num){
        if(num%5!=0){
                System.out.println(num);
            }
    }
    
}
