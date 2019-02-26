

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tema8.Fruteria.Fruteria;

/**
 *
 * @author pietrodeocre
 */
public class fruteriaTest {
    
    public fruteriaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        //Se ejecuta solo una vez antes de empezar de ejecutar la clase
    }
    
    @AfterClass
    public static void tearDownClass() {
        //Se ejecuta solo una vez despues de terminar de ejecutar toda la clase
    }
    
    @Before
    public void setUp() {
        //Se ejecuta antes de empezar de ejecutar cualquier método
    }
    
    @After
    public void tearDown() {
        //Se ejecuta despues de empezar de ejecutar cualquier método
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void hello() {
         int valorSuma = Fruteria.suma(3,5);
         Assert.assertEquals(valorSuma, 7);
     }
}
