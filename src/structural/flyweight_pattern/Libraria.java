package structural.flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class Libraria {

    private final List<Libro> libros = new ArrayList<>();

    public void librariaLibro(String nombre, String precio, String tipo, String distribuidor, String otrosDatos) {
        TipoLibro tipoLibro = FabricaLibro.getTipoLibro(tipo, distribuidor, otrosDatos);
        libros.add(new Libro(nombre, precio, tipoLibro));
    }

    public void mostrarLibros() {
        libros.forEach(System.out::println);
    }
}
