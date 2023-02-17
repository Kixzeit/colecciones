package mx.qbits.ejemplo;

import org.junit.Test;
import mx.qbits.ejemplo2.Producto;
import static org.junit.Assert.*;

public class TestProducto {
    
    @Test
    public void testAlgo() {
        Producto p = new Producto(5, "guantes", 12.21f, false, 123, "algo");
        String q = p.getNombre();
        assertEquals("guantes", q);
    }
}
