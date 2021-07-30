package Instituto;

import java.util.ArrayList;

public class Carrera extends OfertaAcademica{
    private int valorBasico;
    private ArrayList<OfertaAcademica> cursosYtalleres = new ArrayList<>();

    public int getValorBasico() {
        return valorBasico;
    }

    public void setValorBasico(int valorBasico) {
        this.valorBasico = valorBasico;
    }

    public ArrayList<OfertaAcademica> getCursosYtalleres() {
        return cursosYtalleres;
    }

    public void setCursosYtalleres(ArrayList<OfertaAcademica> cursosYtalleres) {
        this.cursosYtalleres = cursosYtalleres;
    }

    //=============METODOS=========================

    public void agregarCurso (Curso c) throws Exception {
        if(c.getCargaHorariaMensual() < 10) {
            throw new Exception("En las carrreras no se pueden agregar cursos de menos de 10 horas");
        }
        else {
            cursosYtalleres.add(c);
        }
    }

    public void agregarTaller(Talleres t){
        cursosYtalleres.add(t);
    }

    @Override
    public int calcularPrecio(){
        int total = 0;
        for (OfertaAcademica o: cursosYtalleres) {
            total += o.calcularPrecio();
        }
        return total;
    }




}
