/*
Se necesita gestionar el stock de una frutería. 
La fruteríapuede tener hasta diez tomates, siete naranjas y 4 plátanos. 
Cada tomate, naranja y plátano puede ser de un tipo diferente, 
por lo tanto, se ha de gestionar cada uno de ellos independientemente. 
Para los tomates se necesita un identificador, nombre, color y textura. 
Para las naranjas un identificador, color y tamaño. Y por último, para 
cada plátano necesitamos un identificador, nombre y tamaño. Se pide:

a)Implementa el sistema descrito anteriormente.

b)Implementa un método que escriba por pantalla los diferentes 
elementos de tomates,naranjas y plátanos ordenados de la siguiente forma:
Por ejemplo:
Tomates:
1NombreTomate1    rojo     robusta
2NombreTomate2     rosáceo ligera......

Naranjas:
2rojo     grande
1rosáceo pequeña......

Plátanos:
1NombrePlatano1    grande
2NombrePlatano2    pequeña......

Sabiendo que los tomates y los plátanos se ordenan de forma creciente
por identificador, y las naranjas de forma creciente por nombre.

c)Crea una clase Main con una frutería(inicializa los diferentes 
atributos) y llama al método del apartado b.
 */
package tema8.Fruteria;

import java.util.Arrays;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    
    
    public static void main(String[] args) {
        
        Naranja[] naranja = {new Naranja("naranja","naranja", "grande"),
        new Naranja("naranja2","naranja", "grande"),
        new Naranja("naranja3","naranja", "grande")
        };
        Platano[] platano = {new Platano("Platano1","grande"),
        new Platano("Platano2","grande"),
        new Platano("Platano3","grande")};
        Tomate[] tomate = {new Tomate("tomate1", "Rojo", "robusta"),
        new Tomate("tomate2", "Rojo", "robusta"),
                new Tomate("tomate3", "Rojo", "robusta")};
        
        Fruteria fruteria = new Fruteria(tomate, naranja, platano);
        
        fruteria.imprimeFrutas();
    }
}
