package structural.composite_pattern;

import structural.composite_pattern.products.EntregaService;
import structural.composite_pattern.products.Libro;
import structural.composite_pattern.products.VideoGame;

public class Main {
    public static void main(String[] args) {
//        Ayuda crear estructuras arboles de objetos con simples y complejos objetos
//        Todos los elementos comparten una interface comun permitiendo el cliente tratar de forma
//        individual los objetos y composiciones uniformes.

        EntregaService entregaService = new EntregaService();
        entregaService.configurarPedido(
                new ComporCaja(
                        new VideoGame("PS5", 500)
                ),
                new ComporCaja(
                        new ComporCaja(
                                new Libro("Clean Code", 200),
                                new Libro("SOLID", 300)
                        ),
                        new VideoGame("XBOX", 450),
                        new VideoGame("Nintendo", 420)
                )
        );

        System.out.println(entregaService.calcularPrecioPedido());
    }
}
