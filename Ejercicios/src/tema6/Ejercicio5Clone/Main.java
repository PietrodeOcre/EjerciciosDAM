/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.Ejercicio5Clone;

/**
 *
 * @author pietrodeocre
 */
public class Main {
    public static void main(String[] args){
        /*
        Para poder clonar el camion previamente tenemos que tener 
        creadas las clases de empresa y persona, ademas tendremos que
        asignar a camion, las clases de empresa y de persona, de esta 
        manera lo podemos clonar y crear un camion2 y que se clonen 
        tambien las clases de empresa y persona en el otro camion2
        
        Ademas un equals de un objeto nulo devuelve siempre una exception nullpointer
        */
        Persona persona=new Persona();
        persona.setApellidos("Perez");
        Empresa empresa=new Empresa();
        empresa.setCif("34445556D");
        Camion camion = new Camion();
        camion.setEmpresa(empresa);
        camion.setPersona(persona);
        Camion camion2 = null;
        
        try {
           
            camion2 = (Camion)camion.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        //System.out.println((camion.equals(camion2)));
        System.out.println(camion);
        System.out.println(camion2);
    }
    
    

    

    
        
  
    
    
    
}
