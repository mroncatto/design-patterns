package structural.flyweight_pattern;

import java.util.List;
import java.util.Random;

public class Main {
    private static final int TIPO_LIBROS = 2;
    private static final int LIBROS_PARA_AGREGAR = 10_000_000;

    public static void main(String[] args) {
//        Debe ser utilizado apenas cuando un problema debe soportar grandes cantidades de objetos a fin
//        de reducir el consumo de RAM compartiendo algunos datos iniciales del objeto

        Libraria libraria = new Libraria();
        for (int i = 0; i < LIBROS_PARA_AGREGAR / TIPO_LIBROS; i++) {
            libraria.librariaLibro(getRandomName(), getRandomPrice(), "Accion", "MD", "Version Limitada");
            libraria.librariaLibro(getRandomName(), getRandomPrice(), "Fantasia", "LF", "-");
        }

        libraria.mostrarLibros();
        System.out.println(LIBROS_PARA_AGREGAR + " Libros agregados");
        System.out.println("==========================================");
        System.out.println("Memory Usage: ");
        System.out.println("Book Size (20 bytes) * " + LIBROS_PARA_AGREGAR + " + BookTypes Size (30 bytes) * " + TIPO_LIBROS + "");
        System.out.println("==========================================");
        System.out.println("Total: " + ((LIBROS_PARA_AGREGAR * 20 + TIPO_LIBROS * 30) / 1024 / 1024) + "MB (instead of " + ((LIBROS_PARA_AGREGAR * 50) / 1024 / 1024) + "MB)");
    }

    private static String getRandomPrice() {
        return String.valueOf(new Random().nextDouble(10, 200));
    }

    private static String getRandomName() {
        List<String> books = List.of("book_1", "book_2", "book_3", "book_4", "book_5", "book_6", "book_7", "book_8", "book_9", "book_10");
        return books.get(new Random().nextInt(books.size()));
    }
}
