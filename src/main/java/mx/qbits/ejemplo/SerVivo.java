package mx.qbits.ejemplo;

import mx.qbits.ejemplo2.Prueba;

public abstract class SerVivo extends Prueba {
    private int edad = 25;
    
    public SerVivo(int edad) {
        this.edad = this.peso + edad;
    }
    public boolean meReproduzco() {
        return true;
    }
    public int getEdad() {
        return this.edad;
    }
    public abstract void comer();
    public String comer(int a) {
        return "glu glu"+a;
    }
}
