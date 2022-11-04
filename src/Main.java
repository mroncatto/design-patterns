import creational.abstractFactoryPattern.*;
import creational.factoryMethodPattern.Restaurante;
import creational.factoryMethodPattern.Sandwich;
import creational.factoryMethodPattern.RestauranteSandwichCarne;
import creational.factoryMethodPattern.RestauranteSandwichVegano;
import creational.singletonPattern.Reloj;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================= CREATIONAL ======================= ");
        System.out.println("[1] - Singleton");
        System.out.println("[2] - Factory Method");
        System.out.println("[3] - Abstract Factory");
        System.out.println("========================================================== ");
        System.out.print("Ingresa una opcion: ");

        int read = scanner.nextInt();
        scanner.close();

        switch (read) {
            case 1:
                singleton();
                break;
            case 2:
                factoryMethod();
                break;
            case 3:
                abstractFactory();
                break;
            default:
                System.out.println("Opcion invalida!");
        }
    }

    private static void singleton() {
        /**
         * Mismo que se llame varias veces, apenas existira 1 instancia
         */
        Reloj r1 = Reloj.getInstancia();
        Reloj r2 = Reloj.getInstancia();
        Reloj r3 = Reloj.getInstancia();
    }

    private static void factoryMethod(){
        /**
         * Un sistema de restaurante necesita procesar pedidos donde pueden optar por 2 tipos de sandwich
         */
        Restaurante restauranteCarne = new RestauranteSandwichCarne();
        Sandwich sandwichCarne = restauranteCarne.pedidoSandwich();

        Restaurante restauranteVegano = new RestauranteSandwichVegano();
        Sandwich sandwichVegano = restauranteVegano.pedidoSandwich();
    }

    public static void abstractFactory(){

        /**
         * Un sistema de industria necesita procesar fabricacion de diferentes tipos de avioes y helicopteros
         * de diferentes tipos de companias que fabrican las aeronaves
         */

        Compania airbus = new FabricanteAirbus();
        Avion avionAirbus = airbus.crearAvion("A380");
        Helicoptero helicopteroAirbus = airbus.crearHelicoptero("H160");

        Compania boeing = new FabricanteBoeing();
        Avion avionBoeing = boeing.crearAvion(" B747");
        Helicoptero helicopteroBoeing = boeing.crearHelicoptero("CH-47");
    }
}