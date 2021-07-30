package EjercicioTren;

public class FactoryFiguras {
    private static FactoryFiguras instance;

    private FactoryFiguras(){

    }

    public static FactoryFiguras getInstance(){
        return instance == null ? new FactoryFiguras() : instance;
    }

    public Figuras crearFigura(String figura) {
        switch (figura) {
            case "Circulo":
                return new Circulos();
            case "Rectangulo":
                return new Rectangulos();
            case "Triangulo":
                return new Triangulos();
            case "Figura Compuesta":
                return new FigurasCompuestas();
            default:
                return null;
        }
    }








}
