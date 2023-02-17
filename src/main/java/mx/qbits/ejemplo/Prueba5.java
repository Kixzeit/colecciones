package mx.qbits.ejemplo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prueba5 {

    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Prueba5 p5 = new Prueba5();
        p5.corre();
    }
    
    public void corre() {
        Rana[] caja = new Rana[100];
        caja[0] = new Rana(16, "rene",  25.52f);
        caja[1] = new Rana(21, "sebas", 755.11f);
        caja[2] = new Rana(12, "gus",   5.02f);
        caja[3] = new Rana(44, "jc",    325.152f);
        
        int r = sum(3,5);
        System.out.println("Resultado = "+r);
    }
    
    public void llena() {
        List<Rana> cajita = new ArrayList<Rana>();
        
        Rana r1 = new Rana(16, "rene",  25.52f);
        cajita.add( r1 );
        
        Rana r2 = new Rana(21, "sebas",  25.52f);
        cajita.add( r2 );
        
        Rana r3 = new Rana(12, "gus",  25.52f);
        cajita.add( r3 );
        
        Rana r4 = new Rana(44, "jc",  25.52f);
        cajita.add( r4 );
        
        Rana r5 = new Rana(16, "rene",  25.52f);
        cajita.add( r5 );
        
        Rana r6 = new Rana(16, "rene",  25.52f);
        cajita.add( r6 );
        
        //cajita.add(new Prueba4());
        Set<Rana> bolsa = new HashSet<Rana>(); // tarea
        Map<String, Rana> mapa = new HashMap<String, Rana>(); // tarea
        SortedSet<Rana> conjuntoOrdenado = new TreeSet<Rana>(); // tarea
        
    }
    
    public int sum(int a, int b) {
        return a+b;
    }

}
