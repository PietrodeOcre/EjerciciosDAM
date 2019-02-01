/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema6.EjercicioRepaso;

/**
 *
 * @author pietrodeocre
 */
public class Test {
    public static void main (String[]args){
        //Creamos objetos de las clases
        Asignatura asignatura = new Asignatura();
        Expediente expediente = new Expediente();
        Alumno alumno = new Alumno();
        
        //Asignamos valores a los atrubutos al alumno1
        
        //Asignatura
        asignatura.setId("prog");
        asignatura.setNombre("Programación");
        
        //Expediente
        expediente.setId("001");
        expediente.setFechaExpediente("08/01/19");
        expediente.setAsignatura(asignatura);
        
        //Alumno
        alumno.setNombre("Manuel");
        alumno.setEdad(38);
        alumno.setSexo('H');
        alumno.setExpediente(expediente);
       
        
        //Creamos objetos de las clases
        //Si es la misma asignatura podemos ahorrar esta linea siguiente
        Asignatura asignatura1 = asignatura;
        Expediente expediente1 = expediente;
        Alumno alumno1 = alumno;
        try{
            alumno1 = (Alumno) alumno.clone();
            asignatura1 = (Asignatura) asignatura.clone();
            expediente1 = (Expediente) expediente.clone();
        } catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        
        
        //Asignamos valores a los atrubutos al alumno1
        
        //Asignatura si es la misma asignatura podemos ovbiarlo
        asignatura1.setId("fis");
        asignatura1.setNombre("Física");
        
        //Expediente
        expediente1.setId("002");
        expediente1.setFechaExpediente("08/01/19");
        //Si es la misma asignatura no hace falta 
        //clonar otra podemos usar la misma
        expediente1.setAsignatura(asignatura1);
        
        //Alumno
        alumno1.setNombre("Pedro");
        alumno1.setEdad(20);
        alumno1.setSexo('H');
        alumno1.setExpediente(expediente1);
        
        
        //Vamos a crear comparaciones entre los alumnos, sus expedientes y asignatura
        
        //Comparando el alumno
        if (alumno.equals(alumno1)){
            System.out.println("Son alumnos iguales");
        }else{
            System.out.println("Son alumnos diferentes");
        }
        //Comparando el expediente
        if (alumno.getExpediente().equals(alumno1.getExpediente())){
            System.out.println("Son expedientes iguales");
        }else{
            System.out.println("Son expedientes diferentes");
        }
        //Comparando la asignatura
        if (alumno.getExpediente().getAsignatura().equals(alumno1.getExpediente().getAsignatura())){
            System.out.println("Son expedientes iguales");
        }else{
            System.out.println("Son expedientes diferentes");
        }
        
        System.out.println(alumno);
        System.out.println(alumno1);
    }
}
