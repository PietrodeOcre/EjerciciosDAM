/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema8.EjerciciosInternet;

/**
 *
 * @author pietrodeocre
 */
class masError extends Exception {
    
    //private String mensaje;
    private int mensaje;
    public masError(int mensaje){
        super(String.valueOf(mensaje));
        this.mensaje = mensaje;
    }

    @Override
    public String getMessage() {
        
        String mensaj = null;
        
        switch (mensaje) {
            case 10:
                //System.out.println("Error 10");
                mensaj = "Error 10";
                break;
            case 20:
                //System.out.println("Error 20");
                mensaj = "Error 20";
                break;
            case 30:
                //System.out.println("Error 30");
                mensaj = "Error 30";
                break;
            default:
                break;
        }
        
        return mensaj; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
