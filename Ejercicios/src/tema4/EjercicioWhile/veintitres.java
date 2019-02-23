/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4.EjercicioWhile;
import java.util.Scanner;
/**
 *
 * @author pietrodeocre
 */
public class veintitres {
    /**
     * @param args the command line arguments
     */
    private static int cont, precioFactura, facturaTotal, facturaMas600, 
             litrosArticuloUno, numArticuloUno, numArticulo,
             numLitros, precioLitro;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        do {
            System.out.print("Cod Art: ");
            numArticulo = sc.nextInt();
            System.out.print("Escribir nº de litros: ");
            numLitros = sc.nextInt();    
            System.out.print("Precio/litro: ");
            precioLitro = sc.nextInt();
            if(cont==0) {
                numArticuloUno=numArticulo;
                litrosArticuloUno=numLitros;
            }
            precioFactura=numLitros*precioLitro;
            if(precioFactura>600){
                ++facturaMas600;
            }
            facturaTotal=facturaTotal+precioFactura;
            ++cont;
        }while(cont<=5);
        System.out.println("Facturación Total: "+facturaTotal);
        System.out.println("Cantidad de litros del primer producto: "+litrosArticuloUno);
        System.out.println("Cantidad de facturas superiores a 600euros: "+facturaMas600);
    }
}
