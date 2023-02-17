package mx.qbits.ejemplo;

public class Principal {
    public void corre() {
        Rana serRana = new Rana(666, "tocayoRanota", 6.7f);
        //serRana.setNombre("TocayoRana");
        
        prueba(serRana);
    }
    public void prueba(Mascota s) {
        System.out.println(s.getNombre());
        System.out.println(s.getEdad());
    }
    public void invoca(Abuelo p) {
        prn(p.hi());
    }
    public void prn(String s) {
        System.out.println(s);
    }
}
// Están de acuerdo en que un autobus es un transporte?
// Están de acierdo en que un autobus tiene motor?
// Están de acuerdo en que un Bocho es un transporte?
// Están de acuerdo en que a un Bocho le caben 5 personas?
// entonces a un autobus sólo le caben 5 personas ? FALSO