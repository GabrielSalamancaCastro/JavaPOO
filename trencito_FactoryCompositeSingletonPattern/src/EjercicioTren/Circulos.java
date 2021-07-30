package EjercicioTren;

public class Circulos implements Figuras {
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(getRadio(),2);
    }
    public String informacionFigura(){
        return "Este es un circulo de radio: " + getRadio();
    }

}
