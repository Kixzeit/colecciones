package mx.qbits.colecciones;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Stream;

public class Tarea {
  public static void main(String[] gustavo) {
    Tarea t1 = new Tarea();
    t1.run();
  }

  public void run() {
    Articulo art1 = new Articulo(1, "television", 123.32f, "blanco");
    Articulo art2 = new Articulo(2, "silla", 234.76f, "rojo");
    Articulo art3 = new Articulo(3, "ventilador", 171.11f, "verde");
    Articulo art4 = new Articulo(4, "estufa", 246.54f, "amarillo");

    SortedSet<Articulo> bolsa = new TreeSet<Articulo>((a, b) -> ordenar(a, b));

      bolsa.add(art1);
      bolsa.add(art2);
      bolsa.add(art3);
      bolsa.add(art4);

      //Foreach
      bolsa.stream().forEach(e -> prn(e.getNombre()));
      bolsa.stream().forEach(e -> prn(e.getNombre() +" "+ e.getColor()));
      
      
      //map y stream
      Stream<Articulo> resultado = bolsa.stream().map(e -> modifica(e));
      Stream<Articulo> art = bolsa.stream().map(e -> obtiene(e));
      
      
      // filter
      resultado.filter(e -> filtro(e));
      art.filter(e -> filtro2(e));
      
  } 
  
  public int ordenar(Articulo p, Articulo q) {
    float r = p.getPrecio() - q.getPrecio();
    if (r > 0)
      return -1;
    if (r < 0)
      return 1;
    if (p.getId() == q.getId())
      return p.getNombre().compareTo(q.getNombre());
    return p.getId() - q.getId();
  }
    
  public void prn(String s) {
    System.out.println(s + ", ");
  }
    
  private Articulo modifica(Articulo e) {
    e.setId(1);
    return e;
  }
    
  private Articulo obtiene(Articulo e) {
    e.getId();
    return e;
  }

  private boolean filtro(Articulo a) {
    return a.getId() > 2;
  }
    
  private boolean filtro2(Articulo a) {
        return a.getPrecio()<200;
    }
}