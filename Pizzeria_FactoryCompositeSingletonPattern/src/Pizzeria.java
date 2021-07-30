import java.util.ArrayList;

public class Pizzeria {
    private ArrayList<Pizza> listaPizzas = new ArrayList<>();

    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    //========= METODOS ==================
    public void agregarPizza(Pizza p){
        listaPizzas.add(p);
    }

    public void mostrarMenu(){
        for (Pizza p: listaPizzas) {
            System.out.println("Nombre de la pizza: " + p.getNombre());
            System.out.println("Nombre de la pizza: " + p.calcularPrecio());
        }
    }
}



