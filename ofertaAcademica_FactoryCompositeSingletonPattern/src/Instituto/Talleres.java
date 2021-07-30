package Instituto;

public class Talleres extends OfertaAcademica {
    private int cantidadTrabajosPracticos;
    private int valorTrabajoPractico;

    public int getCantidadTrabajosPracticos() {
        return cantidadTrabajosPracticos;
    }

    public void setCantidadTrabajosPracticos(int cantidadTrabajosPracticos) {
        this.cantidadTrabajosPracticos = cantidadTrabajosPracticos;
    }

    public int getValorTrabajoPractico() {
        return valorTrabajoPractico;
    }

    public void setValorTrabajoPractico(int valorTrabajoPractico) {
        this.valorTrabajoPractico = valorTrabajoPractico;
    }

    @Override
    public int calcularPrecio(){
        return getCantidadTrabajosPracticos()*getValorTrabajoPractico();
    }

}
