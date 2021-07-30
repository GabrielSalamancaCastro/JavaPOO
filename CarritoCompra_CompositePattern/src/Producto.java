public class Producto {

    //==== ATRIBUTOS ==============
    private String Descripcion;
    private double precio;

    public Producto(String descripcion, double precio) {
        Descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "Descripcion='" + Descripcion + '\'' +
                ", precio=" + precio +
                '}';
    }
}
