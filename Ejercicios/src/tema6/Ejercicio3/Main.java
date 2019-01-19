/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    
    public static void main(String[] args){

        System.out.println("1- para serie"+"\n"+"2- para juego");
        System.out.println("Elige crear una serie o un juego");
        Scanner sc=new Scanner (System.in);
        int elige = sc.nextInt();
        if (elige==1 || elige==2){
            if (elige==1){
                valorSeries();
            }else{
                valorVideojuego();
            }
        }else{
            System.out.println("El valor debe ser 1 o 2, únicamente.");
        }
        
        
    }
    
    public static void valorSeries(){
        
        Serie series = new Serie();
        
        Scanner sc=new Scanner (System.in);
        System.out.print("Escribe el título de la serie: ");
        String titulo = sc.next();
        series.setTitulo(titulo);
        System.out.print("Escribe el género de la serie: ");
        String genero = sc.next();
        series.setGenero(genero);
        System.out.print("Escribe el creador de la serie: ");
        String creador = sc.next();
        series.setCreador(creador);
        System.out.print("Escribe la temporada: ");
        int temporada = sc.nextInt();
        series.setTemporada(temporada);
    }
    
    public static void valorVideojuego(){
        
        Videojuego videojuegos = new Videojuego();
        
        Scanner sc=new Scanner (System.in);
        System.out.print("Escribe el título del juego: ");
        String titulo = sc.next();
        videojuegos.setTitulo(titulo);
        System.out.print("Escribe el género del juego: ");
        String genero = sc.next();
        videojuegos.setGenero(genero);
        System.out.print("Escribe el fabricante del juego: ");
        String compania = sc.next();
        videojuegos.setCompania(compania);
        System.out.print("Escribe las horas de juego: ");
        int horasEstimadas = sc.nextInt();
        videojuegos.setHorasEstimadas(horasEstimadas);
    }
}
