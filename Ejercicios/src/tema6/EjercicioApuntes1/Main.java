/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioApuntes1;
/**
 *
 * @author pietrodeocre
 */
public class Main {
    /*public static void main (String[] args){
        Persona manuel = new Persona();
        manuel.setNombre("Manuel");
        manuel.setEdad(38);
        manuel.setColorPelo("Marron");
        manuel.setAltura(185.5);
        manuel.setSexo('H');
        
        
        Persona manuelClonado = manuel;
        
        manuelClonado.setSexo('M');
        
        System.out.println(manuel);
        System.out.println(manuelClonado);
        
        
    }*/
    
    
    
    public static void main (String[] args) throws CloneNotSupportedException{
        Persona manuel = new Persona();
        
        manuel.setNombre("Manuel");
        manuel.setEdad(38);
        manuel.setDni("3234234432-G");
        manuel.setAltura(185.5);
        manuel.setSexo('H');
        Empresa empresa = new Empresa();
        empresa.setNombre("Cryptocenter");
        empresa.setDireccion("Caller lagasta");
        empresa.setCif("34245364-F");
        manuel.setEmpresa(empresa);
        /*
        Al hacer el ejercicio 3
        Ahora en al ejecutarlo aparece el toString de la empresa
        a continuación del toString del objeto manuel de la clase persona.
        Realiza el clonado del objeto pero al modificar un atributo de 
        empresa modifica dicho atributo en los dos objetos manuel y manuelClonado
        */
        
        Persona manuelClonado = manuel;
        manuelClonado = (Persona)manuel.clone();
        
        
        manuelClonado.setSexo('M');
        manuelClonado.setNombre("Luis");
        Empresa empresa1 = new Empresa();
        empresa1.setNombre("nuker");
        manuelClonado.setEmpresa(empresa1);
        System.out.println(manuelClonado.getEmpresa().getNombre());
        
        /*
        Ejercicio4
        Cuando creamos el objeto clonado no se clona el object empresa1 
        con lo cual si modificamos algo en el objeto clonado de la empresa1
        se cambia en los dos objetos, con lo cual 
        no hace el clonado correctamente
        */
        
        System.out.println(manuel);
        System.out.println(manuelClonado);
        
        /*
            En el ejercicio 2
            Realiza el clonado correctamente, pero cuando modificas un 
           atributo de alguna clase no se modifica en las dos.
        */
        
    }
}
