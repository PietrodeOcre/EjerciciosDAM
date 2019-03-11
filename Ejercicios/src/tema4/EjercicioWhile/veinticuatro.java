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
public class veinticuatro {
    /**
     * @param args the command line arguments
     */
    private static int cont, litrosArticuloUno, numArticuloUno, numArticulo,
             numLitros, numeroPrecio;
    private static double precioFactura, facturaTotal, facturaMas600;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc =new Scanner(System.in);
        do {
            System.out.print("Cod Art: ");
            numArticulo = sc.nextInt();
            System.out.print("Escribir nº de litros: ");
            numLitros = sc.nextInt();    
            System.out.print("Precio número: ");
            numeroPrecio = sc.nextInt();
            if(cont==0) {
                numArticuloUno=numArticulo;
                litrosArticuloUno=numLitros;
            }
            switch (numeroPrecio) {
                case 1:
                    precioFactura=numLitros*0.6;
                    break;
                case 2:
                    precioFactura=numLitros*3;
                    break;
                case 3:
                    precioFactura=numLitros*1.25;
                    break;
                default:
                    break;
            }
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
