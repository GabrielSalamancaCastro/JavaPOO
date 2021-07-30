package EjercicioTren;

public class Triangulos implements Figuras{
    //=====ATRIBUTOS=======
    private double base;
    private double altura;

    //====GETTERS AND SETTERS======

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //========METODOS=============
    @Override
    public double calcularArea(){
        return (getAltura()*getBase())/2;
    }

    @Override
    public String informacionFigura(){
        return "Este triangulo tiene una base de" + getBase() + "Y una altura de: " + getAltura();
    }


}
