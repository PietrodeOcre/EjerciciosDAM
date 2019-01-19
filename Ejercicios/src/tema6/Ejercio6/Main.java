/*
 * Creando un Main para Taller y Empleado para poder dar 
 * valores y comparar objetos.
 */
package tema6.Ejercio6;

/**
 *
 * @author pietrodeocre
 */
public class Main {

    
    public static void main(String[]args){
        
        //Creando los objetos por separado
        Taller taller = new Taller();
        Empleado empleado = new Empleado();
        
        //Creamos un clon del objeto taller y empleado
        Taller taller2 = taller;
        Empleado empleado2 = empleado;
        
        //Creamos un try catch para que no de error el clonado
        //Esto solo es si en la clase, se ha creado el método clone
        //Sin definir el throws CloneNotSupportedException
        try {
            taller2 = (Taller)taller.clone();
            empleado2 = (Empleado)empleado.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        
        
        //Asignamos los empleados a cada taller
        taller.setEmpleado(empleado);
        taller2.setEmpleado(empleado2);
        
        //Definimos valores para el empleado
        empleado.setNombre("Manolo");
        empleado.setEdad((byte)30);
        empleado.setNumeroSS(3322333455l);
        empleado.setSexo('H');
        empleado.setTallerDondeTrabaja("Taller pepe");
        
        //Definimos valores para el empleado2
        empleado2.setNombre("Fernando");
        empleado2.setEdad((byte)35);
        empleado2.setNumeroSS(3322333455l);
        empleado2.setSexo('H');
        empleado2.setTallerDondeTrabaja("Taller jose");
        
        //Definimos valores para el taller
        taller.setNombre("Taller pepe");
        taller.setCif("305445848-D");
        taller.setDireccion("Calle del saler 34");
        taller.setProvincia("Vitoria-Gasteiz");
        taller.setMunicipio("Álava");
        
         //Definimos valores para el taller2
        taller2.setNombre("Taller jose");
        taller2.setCif("33567876-F");
        taller2.setDireccion("Calle La Peseta 23");
        taller2.setProvincia("Madrid");
        taller2.setMunicipio("Madrid");
        
        //Imprimimos en pantalla cada objeto taller creado
        System.out.println ( taller + "\n");
        System.out.println ( taller2);
        
        
        //Aqui vamos a comprara los dos objetos, al hacerlo 
        //Tambien compara los objetos empleado y empleado2 que 
        //tienen en su interior
        if (taller.equals(taller2)){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
        
        /*
        Aquí estamos comparando los objetos Empleado asignado a cada Taller
        */
        if (taller.getEmpleado().equals(taller2.getEmpleado())){
            System.out.println("Iguales");
        }else{
            System.out.println("Diferentes");
        }
        
    }
    
    
}
