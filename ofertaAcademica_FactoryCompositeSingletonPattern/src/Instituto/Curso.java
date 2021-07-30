package Instituto;

public class Curso extends OfertaAcademica{
    //========ATRIBUTOS=============
    private int cargaHorariaMensual;
    private int mesesDuaracion;
    private int valorHora;


    //====GETTERS AND SETTERS==========

    public int getCargaHorariaMensual() {
        return cargaHorariaMensual;
    }

    public void setCargaHorariaMensual(int cargaHorariaMensual) {
        this.cargaHorariaMensual = cargaHorariaMensual;
    }

    public int getMesesDuaracion() {
        return mesesDuaracion;
    }

    public void setMesesDuaracion(int mesesDuaracion) {
        this.mesesDuaracion = mesesDuaracion;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    //==================METODOS=====================
    @Override
    public int calcularPrecio(){
        return getCargaHorariaMensual()*getMesesDuaracion()*getValorHora();
    }



}
