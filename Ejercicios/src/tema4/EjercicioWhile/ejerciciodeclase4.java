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
public class ejerciciodeclase4 {
    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final int dimX = 5;
        final int dimY = 4;

    int a[][] = new int[dimX][dimY];

    for (int cnt = 0, 
             total = dimX * dimY,
             x = 0,
             y = 0;
         cnt < total; 
         cnt++) {

        a[x][y] = cnt;

        // mover en diagonal dirección noreste.
        x--;
        y++;

        // si quedó fuera de los límites del rectángulo,
        // mover al comienzo de la próxima fila en diagonal.
        if (x < 0 || x >= dimX || y < 0 || y >= dimY) {
            y++;
            int delta = Math.min(y, dimX - x - 1);
            x += delta;
            y -= delta;
        }
    }

    for(int x = 0; x < dimX; x++) {
        for(int y = 0; y < dimY; y++) {
            if (y != 0) {
                System.out.print("\t");
            }
            System.out.print(a[x][y]);
        }
        System.out.println();
    }
    }

    
}
