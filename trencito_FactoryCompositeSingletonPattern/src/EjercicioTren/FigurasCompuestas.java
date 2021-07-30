package EjercicioTren;

import java.util.ArrayList;

public class FigurasCompuestas implements Figuras{

    private ArrayList<Figuras> listaDeFiguras;

    //======INICIALIZANDO EN ARRAY============

    public FigurasCompuestas() {
        listaDeFiguras = new ArrayList<Figuras>();
    }


    //========GETTERS AND SETTERS===========
    public ArrayList<Figuras> getListaDeFiguras() {
        return listaDeFiguras;
    }

    public void setListaDeFiguras(ArrayList<Figuras> listaDeFiguras) {
        this.listaDeFiguras = listaDeFiguras;
    }

    //=======METODOS=========================
    public void agregarFigura(Figuras f){
        listaDeFiguras.add(f);
    }

    public double calcularArea(){
        double total=0;
        for (Figuras f: listaDeFiguras) {
            total += f.calcularArea();
        }
        return total;
    }

    public String informacionFigura(){
        return "Area total del vagon es: " + calcularArea();
    }


}
