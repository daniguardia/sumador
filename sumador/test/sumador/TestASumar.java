package sumador;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestASumar {
	
	/**
	 * Prueba que envia una cadena con un digito
	 */
    @Test
    public void testUnaCifra() {
        ASumar sumi = new ASumar();
        String resultado = sumi.mostrar("5");
        assertEquals("5 = 5",resultado );
    }
    
    /**
     * Prueba que envia un negativo
     */
    @Test
    public void testNegativo() {
    	ASumar sumi= new ASumar();
    	String resultado = sumi.mostrar("-5");
    	assertNull(resultado);
    }

}
