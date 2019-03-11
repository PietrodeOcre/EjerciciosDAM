/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio5;

/**
 *
 * @author pietrodeocre
 */
public class Raices {

    private double a, b, c;
    
    
    public static void main(String[] args) {
       Raices ecuacion=new Raices(2,34,75); //creamos el objeto
       ecuacion.calcular(); //Calculamos
        
    }
    
    
    Raices(){
        
    }
    
    Raices(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    private void obtenerRaices(){
        double x1=(-b+Math.sqrt(getDiscriminante()))/(2*a);
        double x2=(-b-Math.sqrt(getDiscriminante()))/(2*a);
        
        System.out.println("Solucion X1");
        System.out.println(x1);
        System.out.println("Solucion X2");
        System.out.println(x2);
    }
    
    private double getDiscriminante(){
        return Math.pow(b, 2)-(4*a*c);
    }
    
    private boolean tieneRaiz(){
        return getDiscriminante()==0;
    }
    
    private boolean tieneRaices(){
        return getDiscriminante()>0;
    }
    
    private void obtenerRaiz(){
         
        double x=(-b)/(2*a);
         
        System.out.println("Unica solucion");
        System.out.println(x);
         
    }
    
    public void calcular(){
         
        if(tieneRaices()){
            obtenerRaices();
        }else if(tieneRaiz()){
            obtenerRaiz();
        }else{
            System.out.println("No tiene soluciones");
        }
         
    }
}
