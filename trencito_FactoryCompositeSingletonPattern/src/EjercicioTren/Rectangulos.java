package EjercicioTren;

public class Rectangulos implements Figuras{
    private double base;
    private double altura;

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

    @Override
    public double calcularArea(){
        return getAltura()*getBase();
    }

    @Override
    public String informacionFigura(){
        return "El area del rectangulo es: " +calcularArea();
    }


}
