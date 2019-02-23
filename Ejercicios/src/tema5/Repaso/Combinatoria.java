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
    
    public long combinaciones(int n, int k){
        if (n<0 || k<0)throw new IllegalArgumentException("n y k han de ser positivos");
        //Casos base
        else if(k==0 || n==k) return 1;//caso base para 1
        else if (k>n) return 0; //caso base para 0
        //Caso general
        else return combinaciones(n-1, k-1)+ combinaciones(n-1,k);
        
    }
    
    public static void main(String[] args){
        if (args.length!=2){
            System.out.println("Se espera dos números como parámetro, n y k. ");
            System.out.println("n= Número total de elementos");
            System.out.println("k= Elementos en cada combinación");
            System.out.println("Devuelve el coeficiente binimial(n, k)");
        }else {
            int n = Integer.parseInt(args[0]);//convertimos String a int
            int k = Integer.parseInt(args[0]);//convertimos String a int
            Combinatoria c = new Combinatoria();//Creamos un objeto c de tipo Combinatoria
            System.out.println(c.combinaciones(n, k));
        }
    }
}
