/*
 * Crea un método millasAMetros() que tome como parámetro de entrada un valor en millas
 * marinas y las convierta a metros.
 * Una vez que tengas este método, escribe otro llamado millasAKilometros() que realice la
 * misma conversión, pero esta vez que exprese el resultado en kilómetros.
 * Nota: 1 milla marina equivale a 1852 metros.
 */
package tema5.Repaso;
import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class siete {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe las Millas: ");
        double millas = sc.nextDouble();
        
        System.out.println("Son: "+millasAMetros(millas)+" metros.");
        System.out.println("Son: "+millasAKilometros(millas)+" kilometros.");
    }
    
    public static double millasAMetros(double millas) {
        double metros;
        return metros = millas*1852;
    }
    
    
    public static double millasAKilometros(double millas){
        double metros;
        return metros = millas*1.8;
    }
    
}
