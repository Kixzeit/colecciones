package mx.qbits.ejemplo;

public class Rana extends Mascota {
    private int ojos = 2;
    
    public Rana(int edad, String nombre, float precio) {
        super(edad);
        float nuevo = edad*precio;
        super.meReproduzco();
    }
    
    public void salta() {
        System.out.println("Saltando");
    }
    public int getOjos() {
        return this.ojos;
    }
    public void setOjos(int ojos) {
        this.ojos = ojos;
    }
    


}
