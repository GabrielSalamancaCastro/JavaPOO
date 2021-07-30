public class PizzaSimple extends Pizza{
    //=======ATRIBUTOS==========
    private double precioBase;
    private boolean esGrande;

    //======= GETTERS AND SETTERS=======
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isEsGrande() {
        return esGrande;
    }

    public void setEsGrande(boolean esGrande) {
        this.esGrande = esGrande;
    }

    //======= METODOS ==================
    @Override
    public double calcularPrecio(){
        double precio =0;
        if(esGrande){
            precio = getPrecioBase()*2;
        }else{
            precio= getPrecioBase();
        }
        return precio;
    }


}
