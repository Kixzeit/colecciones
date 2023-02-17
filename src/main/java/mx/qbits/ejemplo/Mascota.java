package mx.qbits.ejemplo;

public abstract class Mascota extends SerVivo {
    private String nombre;
    
    public Mascota(int a) {
        super(a);
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void comer() {
        System.out.println("respuesta"+super.comer(7));
    }

}
