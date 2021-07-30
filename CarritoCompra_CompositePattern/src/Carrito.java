import java.util.ArrayList;

public class Carrito {

    private Estado estado;
    private ArrayList<Producto> productos;

    public Carrito() {
        this.setEstado(new Vacio(this));
        this.productos = new ArrayList<Producto>();
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProductos(Producto p){
        productos.add(p);
    }

    public void vaciarCarrito(){
        productos.clear();
    }

    public void mostrarProductos(){
        for (Producto p: productos) {
            System.out.println(p.toString());
        }
    }



}
