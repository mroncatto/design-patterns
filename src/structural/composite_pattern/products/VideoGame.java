package structural.composite_pattern.products;

public class VideoGame extends Producto {

    public VideoGame(String titulo, double precio) {
        super(titulo, precio);
    }

    @Override
    public double calcularPrecio() {
        return getPrecio();
    }
}
