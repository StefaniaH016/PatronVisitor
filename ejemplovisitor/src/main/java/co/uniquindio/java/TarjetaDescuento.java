package co.uniquindio.java;


public class TarjetaDescuento implements Visitable{

    private double precio;

    @Override
    public double aceptar(Visitor visitante) {
        
        return visitante.visit(this);
    }

    public double getPrecios() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
}
