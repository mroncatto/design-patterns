package structural.composite_pattern.products;

import structural.composite_pattern.Caja;

public abstract class Producto implements Caja {

    protected final String titulo;
    protected final double precio;

    public Producto(String titulo, double precio) {
        this.titulo = titulo;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPrecio() {
        return precio;
    }
}
