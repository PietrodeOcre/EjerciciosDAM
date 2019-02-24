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
class Combinatoria {
    
    private static int combinatoria(int n, int r){
        if( r == 0 || r == n){
            return 1;}
        if( r > n){
            return 0;}
        int a , b;
        a = combinatoria ( n - 1 , r -1 );
        b = combinatoria ( n - 1 , r );
        return a + b;
        
    }
    
    public static void main(String[] args){
        int n = 16;
        int r = 10;
        
        System.out.println(combinatoria(n, r));
        
        
    }
}
