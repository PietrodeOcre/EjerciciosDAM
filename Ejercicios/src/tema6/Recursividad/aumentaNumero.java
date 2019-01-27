/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Recursividad;

import java.util.Scanner;

/**
 *
 * @author pietrodeocre
 */
public class aumentaNumero {
    static int limit;
	
	public static void main (String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe el límite: ");
		limit = sc.nextInt();
		
		numero(0);

	}

	private static int numero(int num){
		if (num == limit){
                    System.out.print(limit);
                    return limit;
		}else{
                    System.out.print(num);
                    num++;
                    return aumentaNum(num);
		}
	}

	private static int aumentaNum(int num){
            
		if (num == limit){
                    System.out.print(limit);
                    return limit;
		}else{
                    System.out.print(num);
                    num++;
                    return numero(num);
		}
	}
}
