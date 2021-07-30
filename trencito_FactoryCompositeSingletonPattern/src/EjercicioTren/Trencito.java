package EjercicioTren;

public class Trencito {
    public static void main(String[] args) {
        //===========CREANDO LOCOMOTORA==================
        Figuras locomotora = FactoryFiguras.getInstance().crearFigura("Figura Compuesta");

        //==== CREANDO LAS FIGURAS =====================
        Figuras rectangulo1 = FactoryFiguras.getInstance().crearFigura("Rectangulo");
        ((Rectangulos) rectangulo1).setAltura(6);
        ((Rectangulos) rectangulo1).setBase(4);

        Figuras rectangulo2 = FactoryFiguras.getInstance().crearFigura("Rectangulo");
        ((Rectangulos) rectangulo2).setAltura(2);
        ((Rectangulos) rectangulo2).setBase(3);

        Figuras triangulo1 = FactoryFiguras.getInstance().crearFigura("Triangulo");
        ((Triangulos) triangulo1).setAltura(2);
        ((Triangulos) triangulo1).setBase(2);

        Figuras circulo1 = FactoryFiguras.getInstance().crearFigura("Circulo");
        ((Circulos) circulo1).setRadio(1);

        Figuras circulo2 = FactoryFiguras.getInstance().crearFigura("Circulo");
        ((Circulos) circulo2).setRadio(1);

        //=====AÑADIENDO FIGURAS A LA LOCOMOTORA========
        ((FigurasCompuestas) locomotora).agregarFigura(rectangulo1);
        ((FigurasCompuestas) locomotora).agregarFigura(rectangulo2);
        ((FigurasCompuestas) locomotora).agregarFigura(triangulo1);
        ((FigurasCompuestas) locomotora).agregarFigura(circulo1);
        ((FigurasCompuestas) locomotora).agregarFigura(circulo2);

        System.out.println(locomotora.calcularArea());





    }



}
