/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;

/**
 *
 * @author pietrodeocre
 */
public class ejerciciodeclase1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i = 0;
        while (i<=10){
            i++;
            continue;
            /*if(i%2!=0){
		System.out.println("3");
            }else if(i==4){
		break;	
            }else {
		continue;
            }*/
            //i++;
        }
        System.out.println("i: "+i);
    }
}
