/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio4;
/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[] args){
        Libro libro1 = new Libro(445232342345343455l, "El secreto","Rhonda Byrne", 482);
        Libro libro2 = new Libro(234223234343887798l, "El anillo de los nibelungos","Richard Wagner", 791);
        System.out.println(libro1);
        System.out.println(libro2);
        
        if (libro1.getNumeroPaginas()>libro2.getNumeroPaginas()){
            System.out.println(libro1.getTitulo()+" tiene más páginas que "+libro2.getTitulo());
        }else {
            System.out.println(libro2.getTitulo()+" tiene más páginas que "+libro1.getTitulo());
        }
    }
}
