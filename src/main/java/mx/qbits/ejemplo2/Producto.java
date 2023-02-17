package mx.qbits.ejemplo2;

public class Producto  {
    private int id;
    private String nombre;
    private float precio;
    private boolean paraRegalo;
    private int existencia;
    private String color;
    
    public Producto(int id, String nombre, float precio, boolean paraRegalo, int existencia, String color) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.paraRegalo = paraRegalo;
        this.existencia = existencia;
        this.color = color;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public boolean isParaRegalo() {
        return paraRegalo;
    }
    public void setParaRegalo(boolean paraRegalo) {
        this.paraRegalo = paraRegalo;
    }
    public int getExistencia() {
        return existencia;
    }
    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + existencia;
        result = prime * result + id;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + (paraRegalo ? 1231 : 1237);
        result = prime * result + Float.floatToIntBits(precio);
        return result;
    }

    @Override
    public String toString() {
        return nombre + "(" + id + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Producto other = (Producto) obj;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        if (existencia != other.existencia)
            return false;
        if (id != other.id)
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (paraRegalo != other.paraRegalo)
            return false;
        if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
            return false;
        return true;
    }
/*
    public int compareTo(Object prod) {
        Producto other = (Producto) prod;
//        int r = this.existencia - other.existencia;
//        if(r!=0) return r;
//        return nombre.compareTo(other.nombre);
        float r = this.precio - other.precio;
        if(r>0) return -1;
        if(r<0) return 1;
        return nombre.compareTo(other.nombre);
    }
    */
    
}
