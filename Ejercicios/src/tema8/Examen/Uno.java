/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.Examen;

/**
 *
 * @author pietrodeocre
 */
public class Uno {
    public static void main(String[] args) {
        try{
            for (int i = 0; i < 2; i++) {
                if (i == 1){
                    throw new IllegalArgumentException();
                }else{
                    System.out.println("Cersei Lannister");
                }
            }
        }catch (Error e){
            System.out.println("Jhon Nieve");
        }finally{
            System.out.println("Tyrion Lannister");
        }
        System.out.println("Sansa Stark");
    }
}
