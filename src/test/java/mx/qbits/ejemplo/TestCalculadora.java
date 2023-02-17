package mx.qbits.ejemplo;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {
    private Calc calc = new Calc();
    
    @Test
    public void testConcatenate() {
        int result = calc.suma(3, 5);
        assertEquals(11, result);
    }
    @Test
    public void testConcatenate2() {
        int result = calc.suma(5, 5);
        assertEquals(10, result);
    }
}
