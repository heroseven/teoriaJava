/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import pruebasUnitarias.Calculadora;

/**
 *
 * @author stephan
 */
public class PruebaCalculadora {
    
    public PruebaCalculadora() {
        
        
    }
    
    @Test
    public void testSuma(){
        
        Calculadora a= new Calculadora();
        
        
        Assert.assertEquals("no suma correctamente", 12, a.suma(4, 8));
        
    }
}