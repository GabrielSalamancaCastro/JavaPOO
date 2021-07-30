package Instituto;

import java.util.ArrayList;

public class ProgramaIntensivo extends OfertaAcademica {
    private ArrayList<Curso> listaDeCursos;

    public ProgramaIntensivo() {
        listaDeCursos = new ArrayList<Curso>();
    }

    public ArrayList<Curso> getListaDeCursos() {
        return listaDeCursos;
    }

    public void setListaDeCursos(ArrayList<Curso> listaDeCursos) {
        this.listaDeCursos = listaDeCursos;
    }

    //============METODOS=====================
    public void agregarCurso(Curso c){
        listaDeCursos.add(c);
    }

    @Override
    public int calcularPrecio(){
        int total = 0;
        for (Curso c: listaDeCursos) {
            total += c.calcularPrecio();
        }
        return total;
    }
}
