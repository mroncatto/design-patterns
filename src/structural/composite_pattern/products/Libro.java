package structural.composite_pattern.products;

public class Libro extends Producto {

    public Libro(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
