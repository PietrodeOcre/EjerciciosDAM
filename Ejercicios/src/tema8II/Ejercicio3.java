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
public class Ejercicio3 {
    static String s = "-";
public static void main(String []args){
new Ejercicio3().s1();
System.out.println(s);
}
void s1(){
try { s2(); }
catch (Exception e) { s+="c";}
}
void s2(){
    //Un try para capturar aquí o elevar con throws para que la pueda capturar en s2() con su catch.
//s3(); 
s+="2";
//s3(); 
s+="2b";
}
void s3() throws Exception{
throw new Exception();
}
}
