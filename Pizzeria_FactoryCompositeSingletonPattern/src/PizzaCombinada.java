import java.util.ArrayList;

public class PizzaCombinada extends Pizza {
    //========ATRIBUTOS===========
    private ArrayList<Pizza> pizzaCombinada;

    //====== INICIALIZANDO EL ARRAY =============

    public PizzaCombinada() {
        pizzaCombinada = new ArrayList<Pizza>();
    }

    //=========== GETTERS AND SETTERS ===============
    public ArrayList<Pizza> getPizzaCombinada() {
        return pizzaCombinada;
    }

    public void setPizzaCombinada(ArrayList<Pizza> pizzaCombinada) {
        this.pizzaCombinada = pizzaCombinada;
    }

    // =============METODOS===================
    public void agregarPizza(Pizza p){
        pizzaCombinada.add(p);
    }

    @Override
    public double calcularPrecio(){
        double precio=0;
        for (Pizza p: pizzaCombinada) {
            precio += p.calcularPrecio();
        }
        return precio/pizzaCombinada.size();
    }
}
