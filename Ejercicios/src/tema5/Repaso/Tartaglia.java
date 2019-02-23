/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5.Repaso;


/**
 *
 * @author pietrodeocre
 */
public class Tartaglia {

    public Tartaglia tartaglia;
    
    
/**
     *
     * @param args
     */
        public static void main(String[] args){
        
        Combinatoria c =new Combinatoria();
        System.out.println(new Tartaglia(c,6));
    }
    
    
    public Tartaglia(Combinatoria c, int n){
        this.tartaglia = new Tartaglia();
        
    }

    private Tartaglia() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    


    
    @Override
    public String toString(){
        return "Triangulo de Tartaglia";
    }
    
}
