public class PizzaFactory {
    private static PizzaFactory instance;

    public static PizzaFactory getInstance(){
        return instance == null ? new PizzaFactory() : instance;
    }

    public Pizza crearPizza(String t){
        switch (t){
            case "Pizza Simple":
                return new PizzaSimple();
            case "Pizza Combinada":
                return new PizzaCombinada();
            default:
                return null;
        }
    }



}
