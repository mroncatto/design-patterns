package structural.flyweight_pattern;

public class Libro {
    private final String nombre;
    private final String precio;
    private final TipoLibro tipo;

    public Libro(String nombre, String precio, TipoLibro tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public TipoLibro getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", precio='" + precio + '\'' +
                ", tipo=" + tipo +
                '}';
    }
}
