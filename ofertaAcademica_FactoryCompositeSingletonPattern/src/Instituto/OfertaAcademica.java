package Instituto;

public abstract class OfertaAcademica {
    //======ATRIBUTOS================
    private String nombre;
    private String descripcion;


    //===========GETTERS AND SETTERS======================
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //======METODOS==============================
    public abstract int calcularPrecio();


}
