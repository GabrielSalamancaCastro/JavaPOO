public class Main {
    public static void main(String[] args) {

        //============= HACIENDO PIZZA MUZARRELLA ================
        Pizza pizzaMuzarella = new PizzaFactory().crearPizza("Pizza Simple");
        pizzaMuzarella.setNombre("Pizza Muzarrella");
        pizzaMuzarella.setDescripcion("Increible Pizza de Muzarrella");
        ((PizzaSimple) pizzaMuzarella).setPrecioBase(700);
        ((PizzaSimple) pizzaMuzarella).setEsGrande(true);
        System.out.println("El precio de la Pizza grande de Muzarrella es: " + ((PizzaSimple) pizzaMuzarella).calcularPrecio());

        //========= HACIENDO PIZZA ESPECIAL =================
        Pizza pizzaEspecial = new PizzaFactory().crearPizza("Pizza Simple");
        pizzaEspecial.setNombre("Pizza Especial");
        pizzaEspecial.setDescripcion("Increible pizza Especial");
        ((PizzaSimple) pizzaEspecial).setPrecioBase(850);
        ((PizzaSimple) pizzaEspecial).setEsGrande(false);

        //==============HACIENDO PIZZA DE ANANA=================
        Pizza pizzaAnana = new PizzaFactory().crearPizza("Pizza Simple");
        pizzaAnana.setNombre("Pizza Anana");
        pizzaAnana.setDescripcion("Increible pizza de Anana");
        ((PizzaSimple) pizzaAnana).setEsGrande(false);
        ((PizzaSimple) pizzaAnana).setPrecioBase(950);



        Pizza pizzaCombinadaLoca = new PizzaFactory().crearPizza("Pizza Combinada");
        pizzaCombinadaLoca.setNombre("Pizza Combinada Loca");
        pizzaCombinadaLoca.setDescripcion("Deliciosa Pizza Combinada Loca");
        ((PizzaCombinada) pizzaCombinadaLoca).agregarPizza(pizzaEspecial);
        ((PizzaCombinada) pizzaCombinadaLoca).agregarPizza(pizzaAnana);
        System.out.println("El precio de la Pizza Combinada Especial es: " + ((PizzaCombinada) pizzaCombinadaLoca).calcularPrecio());

        Pizzeria laMejorPizza = new Pizzeria();
        laMejorPizza.agregarPizza(pizzaAnana);
        laMejorPizza.agregarPizza(pizzaEspecial);
        laMejorPizza.agregarPizza(pizzaMuzarella);
        laMejorPizza.agregarPizza(pizzaCombinadaLoca);

        laMejorPizza.mostrarMenu();









    }
}
