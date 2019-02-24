/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lib;

import java.util.Scanner;



/**
 *
 * @author pietrodeocre
 */
public class Libreria {
    
    private static void raizDeN(int a){
        // Definimos que si a es menor o igual a 0 de error de lo contrario muesre la raiz
        System.out.print((a<=0)?"Error":"La raiz del número es "+Math.sqrt(a));
    }
    
    private static void multiYSumaDeTresNum (int a, int b, int c){
        //Definimos que si a es menor que 0 se multipliquen y si no se sumen
        System.out.print((a<0)?"El producto de dichos números es:"+(a*b*c):"La suma de dichos números es:"+(a+b+c));
    }
    
    private static void sumaImparesYPares(int a){
        //Desde el numero que digamos hasta 100 este método muestra la suma de los números pares
        //Y la suma de los números de los impares
        int b=0;
        int c=0;
        //Definimos el bucle
        while (a<100){
            //Aumentamos el contador hasta llegar a 100
            ++a;
            //Imprimirmos contador 
            System.out.println("Mostramos la cuenta: "+ a);
            if (a%2 == 0){
                //Si a es par lo sumamos en la variable b
                b+=a;
            }else{
                //Si a es impar lo sumamos en la variable c
                c+=a;
            }
        }
        //Imprimirmos la suma de numero pares y al de numeros impares
        System.out.println("Los números pares sumados: "+ b);
        System.out.println("Los números impares sumados: "+ c);
    }
    
    private static void tablaMultiplicarDeNumero(int num){
        //Muestra la tabla de multiplicar del número entregado pro el parámetro
        int a = 0;
        while (a<=10){
            System.out.println(num +" * "+ a +" = "+ (num*a));
            ++a;
        }
    }
    
    private static void numeroMayorDeTres(int a, int b, int c){
        //Definimos método para que indique cual de los tres numeros es mayor o si no hay diferencia
        System.out.println("El mayor entre "+a+", "+b+" y "+c+" es "+((a==b || a==c || b==c)?"no hay diferencia":((a>b && a>c)?a:(b>c && b>a)?b:c)));
    }
    
    private static void divisionEntreMenor(int a, int b){
        //Dados dos números se divide siemrpe el mayor entre el menor.
        System.out.println("La división del mayor entre el menor es "+ a +" y "+ b +" es "+((a==b)?1:((a>b)?(a/b):(b/a))));
    }
    
    private static void notaMediaDeNAlumnos(int alumnos, double nota1, double nota2){
        //Pregunta el número de alumnos y dos notas de cada uno
        int contador = 1;
	while (contador<=alumnos) {
            //Indica la media de las dos notas del alumno 
            System.out.println("La nota del alumno "+contador+" es "+((nota1*0.6)+(nota2*0.4)));
            ++contador;
        }
    }
    
    private static void parImparMasCuantos(int a){
        //Indica un número de 0 a 100
        //El método nos muestra desde ese número hasta 100 
        //Cual es par y cual impar
        //Finalmente indica cuantos números hay de cada tipo
        int b=0; 
        int c=0;
        while (a<100){
            //Aumentamos el contador
            ++a;
            if (a%2 == 0){
                System.out.println("Este número es par: "+ a);
                ++b;
            }else{
                System.out.println("Este número es impar: "+ a);
                ++c;
            }
        }
        System.out.println("Número total de números pares: "+ b);
        System.out.println("Número total de números impares: "+ c);
    }
    
    private static void mayorQue(int a, int b){
        //Indica cual es mayor de dos números
        if (a==b){
            System.out.println("Los números "+ a +" y "+ b +" son iguales");
        }else if (a>b){
            System.out.println("El "+ a +" es mayor");
        } else {
            System.out.println("El "+ b +" es mayor");
        }
    }
    
    private static void sumaPares(int a){
        //Indica la suma de numeros pares desde 0 hasta el número dado
        int b=0;
        int c=0;
        while(b<=a){
            if (b%2 == 0){
                c=c+b;
                 
            }
            ++b;
        }
        System.out.print("La suma de los números pares es: "+c);
    }
    
    private static void mayorDeTres(int a, int b, int c){
        //Indica el mayor de tres números o ninguno si todos son iguales
        System.out.print("El mayor de los tres es "+((a==b && b==c)?"Ninguno":(a>b && a>c)?a:(b>a && b>c)?b:c));
    }
    
    private static void media(){
        //Indica la media de los números que nos pida hasta que pongamos un número negativo
        Scanner sc = new Scanner(System.in);
        int contador, sumador, numerouno;
        //Asignar variables
        contador=0;
        sumador=0;
        //Definimos Condiciones
        do {
            //Pedimos número
            System.out.print("Escribe un numero: ");
            numerouno = sc.nextInt();
            if (numerouno>=0){
                //Realizamos operaciones
                contador++;
                sumador += numerouno;
            }
        } while (numerouno>=0);
        System.out.println("La media es: "+(sumador/contador));
    }
    
    private static boolean impar(int numero){
        //Devuelve true si es impar y false si es par  
        return numero%2!=0;
    }
    
    private static boolean par(int numero){
        //Devuelve true si es par y false si es impar
        return numero%2==0;
    }
    
    private static void aciertaNumero(){
        //Juego para acertar un número aleatorio 
        Scanner sc = new Scanner(System.in);
        int num_secreto = (int) (Math.random()*1000);
        int num_introducido;
        boolean acierto = false;
        do {
            System.out.print("Escribe un número: ");
            num_introducido = sc.nextInt();
            if (num_introducido == num_secreto){
                System.out.print("Acertaste!!!!");
                acierto=true;
            }else if (num_introducido > num_secreto){
                System.out.println("Menor!");
            }else{
                System.out.println("Mayor!");
            }
        }while (num_introducido != num_secreto);
    }
    
    private static int factorial(int num){
        //Indica y devuelve el factorial del número pasado por parámetro
        int sum=0;
        int cont=0;
        while(cont<num){
            cont++;
            sum*=cont;
        }
        System.out.println("El factorial del número es: "+sum);
        return sum;
        
    }
    
    private static void productoDeImpares(int numero){
        //Indica el producto de números impares hasta el número indicado en el parámetro
        int cont, num;
        //Asignamos valores a variables
        cont=0;
        num=1;
        //Definimos bucle
        while(cont<numero){
            cont++;
            if (cont%2!=0){
                num*=cont;
                System.out.print((cont!=(numero-1))?cont+"*":cont);
            }
        }
        System.out.println("="+num);
    }
    
    private static void cuentaAtras(int num){
        //Cuenta atras desde cien, contando de parametro num en parametro num
        int x = 100;
	do {
            System.out.println(x);
            x -=num;
        } while(x>num);
    }
    
    private static void arrayRectangulo(int dimX, int dimY){
        //Crea un rectangulo de la dimensiones indicadas por parametros
        //Recorre el array mostrando numeros en forma diagonal 
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
    
    private static void positivoNegativo(int num){
        //Indica si un número es positivo o negativo
        System.out.println("El número es "+((num>0)?"positivo":"negativo"));
    }
    
    private static void cuadradoDeN(int num){
        //Muestra el cuadrado de un número
        System.out.println("El cuadrado del número es "+(num*num));
    }
    
    private static void numeroNumeros(int[] array){
        //Pide un array de números hasta para mostrar el número de enteros que contiene
        int numerodos = 0;
        int[] numerouno = array;
        // Declaramos condicion 
        do {
            for (int i = 0; i < numerouno.length; i++) {
                if (numerouno[i]>0){
                    numerodos++;
                }
            }        
        } while(numerodos>numerouno.length);
        System.out.println("El número de enteros del array es " + numerodos);
    }
    
    private static boolean esPrimo(int numero){
        //Revisa si un numero entero es primo o no.
        //Si es par no es primo
        int contador=2;
        boolean primo=true;
        if (numero%2==0){
            primo = false;
            return primo;
        }
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
            primo = false;
            contador++;
        }
        return primo;
    }
    
    private static void potencia(int base, int exponente){
        //Eleva un número a otro
        int resultado = 0;
        for (byte i=0; i<exponente; i++){
            if (i==0){
                resultado = base;
            } else{
                resultado=resultado*base;
            }
            
        }
        System.out.println("El resultado es: "+resultado);
    }
    
    private static void tablaMultiplicar() {
        // Tablas de multiplicar desde 0 a 10
        int acumulado;
        acumulado = 0;
        //Definimos la iteración
        for (int contadorInicio=1;contadorInicio<=11; contadorInicio++){
            //Con este bucle for creamos el primer número a multiplicar
            for (int contadorTabla=0;contadorTabla<=10; contadorTabla++){
                //Con este bucle for creamos el número por el cual se multiplica y mostramos el resultado
                System.out.println(acumulado+"*"+contadorTabla+"="+
                        (acumulado*contadorTabla ));
            }
            acumulado++;
        }
    }
    
    private static void primosHasta(int cuentaHasta){
        //Nos muestra los números primos desde 0 hasta el número pasado por parámetro 
        int secuencia, primo;
        secuencia=1;
        primo=0;
        //Comenzamos iteración
        while(secuencia<=cuentaHasta){
            int sumador=0;//aquí guardamos por cuantos números es divisible el número iterado
            for (int division=1; division<=secuencia; division++){
                if (secuencia%division==0){
                    ++sumador;//Si el numero es divisible por 0 se suma aqui
                }
            }
            if (sumador==2){
                primo++;//Si el numero solo es divisible 2 veces es por que es primo
                //Se divide por 1 y por el mismo, es decir 2 veces.
                //System.out.println(secuencia);
            }
            ++secuencia;//Aumentamos la secuencia para pasar al siguiente número
        }
        System.out.println("Los números primos son: "+primo);
    }
    
    private static void notaAlumno(int nota){
        //Método que devuelve si un alumno aprueba o no segun su nota.
        int suspenso=0;
        int aprobado=0;
        int condicion=0;
        int cont = 0;
        do{
            if(nota<4){
                suspenso++;
            } 
            if(nota==4){
                condicion++;
            }
            if (nota>=5){
                aprobado++;
            }
            cont++;
        }while(cont<=6);
        System.out.println("Aprobados: "+aprobado);
        System.out.println("Condicionados : "+condicion);
        System.out.println("Suspendidos: "+suspenso);
    }
    
    private static void divsiblePor3(int num){
        if (num%3 == 0){ //Si el número dividido por 3 tiene resto 0, es múltiplo
                System.out.println("Este un número: "+num+", es múltiplo de tres.");
            }
    }
    
    private static void sueldoMasGrande(double sueldo){
        //Indica cual es el mayor de entre 10 sueldos
        int sueldos = 10;
        int cont=1;
        double sueldoMax=0;
        do {
            if (sueldo>sueldoMax){
                sueldoMax=sueldo;
            }
            cont++;
        }while(cont>=sueldos);
        System.out.print("El sueldo mas alto es:  "+sueldoMax);
    }
    
    private static void rombo(){
        //Dibuja un rombo mediante anidamiento de for (pero sin anidar)
        int i;
        int j;
        String k= " ";
        String h = "*";
        
               
        for (i=0; i<1; i++){
            System.out.println(k+k+k+h);
        }
        for (i=1; i<=1; i++){
            System.out.println(k+k+h+h+h);
        }
        for (i=1; i<=1; i++){
            System.out.println(k+h+h+h+h+h);
        }
        for (i=1; i<=1; i++){
            System.out.println(k+k+h+h+h);
        }
        for (i=0; i<1; i++){
            System.out.println(k+k+k+h);
        }
    }
    
    private static int numeroCifrasDos(long b){
        //Devuelve el numero de cifras de un número dado
        int cont=0;
        do{
            b=b/10;
            ++cont;
        }while(b>=1);
        return cont;
    }
     
    private static double tuDescuento(double precioAntes, double precioActual){
        //Muestra y devuelve el descuento aplicado a un producto, dandole 
        //El precio anterior y el actual
        double descuento=100-(100*precioActual/precioAntes);
        System.out.println("El descuento es: "+ descuento +"%");
        return descuento;
    }
    
    private static double centrigradosAFarenheit(double num){
        //Devuelve el valor de grados Centigrados por parametro en grados Farenheit
        double respuesta;
	respuesta = (1.8)*num+32;
	return respuesta;
    }
    
    private static double farenheitACentigrados(double num){
        //Devuelve el valor de grados Farenheit por parametro en grados Centigrados
        double respuesta;
	respuesta = (num-32)/1.8;
	return respuesta;    
    }
    
    private static boolean Descompuesto(int num){
        //Devuelve true o false si le damos un número de 5 cifras que sea capicua
        boolean capicua;
        int decenaMillar, millar, centena, decena, unidad;
        decenaMillar= num/10000;
        millar = (num/1000)-(decenaMillar*10);
        centena = (num/100)-(decenaMillar*100)-(millar*10);
        decena = (num/10)-(decenaMillar*1000)-(millar*100)-(centena*10);
        unidad = (num%10);
        if(millar==decena && decenaMillar == unidad){
           return capicua=true;
        }else{
           return capicua=false;
        } 
    }
    
    private static int combinatoria(int n, int r){
        //Veduelve r posibles combinaciones de n, siendo estos dos numeros dados
        if( r == 0 || r == n){
            return 1;}
        if( r > n){
            return 0;}
        int a , b;
        a = combinatoria ( n - 1 , r -1 );
        b = combinatoria ( n - 1 , r );
        return a + b;    
    }
    
    private static void esPar(int num){
        //Indica que un número es par
        if(num%2==0){
            System.out.println(num +" es par.");
        }  
    }
    
    private static void Impares(int num){
        //Indica que un número es impar
        if(num%2!=0){
                System.out.println(num +" es impar.");
            }
    }
    
    private static void trianguloDeN (int num){
        //Crea un triangulo de tantas filas como el número dado y compuesto por
        //números que van desde cero hasta el número dado
        int aux;
            for (int i=1;i<=num;i++){
                aux=i;
                for (int j=0;j<i;j++){
                    System.out.print(aux);
                }
            System.out.println("");
        }
    }
    
    
    
}
