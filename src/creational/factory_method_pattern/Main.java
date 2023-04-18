package creational.factory_method_pattern;

import creational.factory_method_pattern.concrete_creator.RestauranteSandwichCarne;
import creational.factory_method_pattern.concrete_creator.RestauranteSandwichVegano;
import creational.factory_method_pattern.creator.Restaurante;
import creational.factory_method_pattern.product.Sandwich;

public class Main {
    public static void main(String[] args) {
//         Se necesita procesar pedidos donde pueden optar por 2 tipos de sandwich

        Restaurante restauranteCarne = new RestauranteSandwichCarne();
        Sandwich sandwichCarne = restauranteCarne.pedidoSandwich();

        Restaurante restauranteVegano = new RestauranteSandwichVegano();
        Sandwich sandwichVegano = restauranteVegano.pedidoSandwich();

//        Si es necesario agregar un nuevo tipo de sandwich, implementamos
//        un nuevo producto y un nuevo concrete product.
    }
}
