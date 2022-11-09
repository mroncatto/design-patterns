import behavioral.chain_of_responsability_pattern.*;
import behavioral.chain_of_responsability_pattern.handlers.Handler;
import behavioral.chain_of_responsability_pattern.handlers.RoleCheckHandler;
import behavioral.chain_of_responsability_pattern.handlers.UserExistsHandler;
import behavioral.chain_of_responsability_pattern.handlers.ValidPasswordHandler;
import behavioral.command_pattern.commands.AbrirCerrarCortinaCommand;
import behavioral.command_pattern.commands.AccionarLamparaCommand;
import behavioral.command_pattern.components.invoker.Piso;
import behavioral.command_pattern.components.invoker.Habitacion;
import behavioral.mediator_pattern.Dialog;
import behavioral.memento_pattern.Editor;
import behavioral.observer_pattern.EmailMsgListener;
import behavioral.observer_pattern.Evento;
import behavioral.observer_pattern.MobileAppListener;
import behavioral.observer_pattern.Tienda;
import behavioral.template_method_pattern.BaseGameLoader;
import behavioral.template_method_pattern.DiabloLoader;
import behavioral.template_method_pattern.WorldOfWarcraftLoader;
import creational.abstract_factory_pattern.abstract_factory.Compania;
import creational.abstract_factory_pattern.concrete_factory.FabricanteAirbus;
import creational.abstract_factory_pattern.concrete_factory.FabricanteBoeing;
import creational.abstract_factory_pattern.product.Avion;
import creational.abstract_factory_pattern.product.Helicoptero;
import creational.builder_pattern.Car;
import creational.builder_pattern.CarBuilder;
import creational.factory_method_pattern.creator.Restaurante;
import creational.factory_method_pattern.product.Sandwich;
import creational.factory_method_pattern.concrete_creator.RestauranteSandwichCarne;
import creational.factory_method_pattern.concrete_creator.RestauranteSandwichVegano;
import creational.prototype_pattern.Computadora;
import creational.prototype_pattern.Electronico;
import creational.prototype_pattern.ElectronicoCache;
import creational.prototype_pattern.Tablet;
import creational.singleton_pattern.Reloj;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======================= Patrones creacionales =========================== ");
        System.out.println("[1] - Singleton");
        System.out.println("[2] - Factory Method");
        System.out.println("[3] - Abstract Factory");
        System.out.println("[4] - Builder");
        System.out.println("[5] - Prototype");
        System.out.println("\n ======================= Patrones de comportamiento ======================= ");
        System.out.println("[6] - Chain Of Responsability");
        System.out.println("[7] - Command");
        System.out.println("[8] - Template Method");
        System.out.println("[9] - Mediator");
        System.out.println("[10] - Memento");
        System.out.println("[11] - Observer");
        System.out.println("\n ========================================================================== ");
        System.out.print("\n Ingresa una opcion: ");

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
            case 4:
                builder();
                break;
            case 5:
                prototype();
                break;
            case 6:
                chainOfResponsability();
                break;
            case 7:
                command();
                break;
            case 8:
                templateMethod();
                break;
            case 9:
                mediator();
                break;
            case 10:
                memento();
                break;
            case 11:
                observer();
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
         * Ejemplo: Un sistema de industria necesita procesar fabricacion de diferentes tipos de avioes y helicopteros
         * de diferentes tipos de companias que fabrican las aeronaves
         */

        Compania airbus = new FabricanteAirbus();
        Avion avionAirbus = airbus.crearAvion("A380");
        Helicoptero helicopteroAirbus = airbus.crearHelicoptero("H160");

        Compania boeing = new FabricanteBoeing();
        Avion avionBoeing = boeing.crearAvion(" B747");
        Helicoptero helicopteroBoeing = boeing.crearHelicoptero("CH-47");
    }

    public static void builder() {
        /**
         * Creacion de objeto etapa por etapa de forma simples
         */
        Car car1 = new CarBuilder()
                .color("Azul")
                .marca("Toyota")
                .modelo("Corola")
                .puertas(4)
                .build();

        Car car2 = new CarBuilder()
                .color("Rojo")
                .marca("Lamborgini")
                .modelo("Aventador")
                .puertas(2)
                .build();

        System.out.println("El auto 1 es un " + car1.getMarca() + ", modelo " + car1.getModelo() + ", color " + car1.getColor());
        System.out.println("El auto 2 es un " + car2.getMarca() + ", modelo " + car2.getModelo() + ", color " + car2.getColor());
    }

    public static void prototype(){
        /**
         * Copia de objetos sin depender de la clase
         */
        List<Electronico> electronicos = List.of(
                new Computadora("comp_marca", "comp_modelo", "comp_color", "comp_potencia"),
                new Tablet("tablet_marca", "tablet_modelo", "tablet_color", "tablet_tela")
        );

        List<Electronico> copyList = new ArrayList<>();
        for(Electronico electronico : electronicos){
            copyList.add(electronico.clone());
        }

        copyList.forEach(System.out::println);
        System.out.println("===========================");

        ElectronicoCache registro = new ElectronicoCache();
        registro.put(electronicos);
        System.out.println(registro.get("comp_marca comp_modelo"));
    }

    public static void chainOfResponsability(){
        /**
         * Manejo de una lista de reglas para un login donde cada regla se concentra en un handler proprio
         */
        Database database = new Database();

        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler());

        AuthService service = new AuthService(handler);
        service.logIn("admin", "admin_password");
    }

    public static void command(){
        /**
         * Ejecuta llamada de metodos en objetos standalone de forma escalable
         */
        Habitacion habitacion = new Habitacion();
        habitacion.setCommand(new AbrirCerrarCortinaCommand(habitacion.getCortina()));
        habitacion.executeCommand();
        System.out.println(habitacion.cortinaAbierta());

        System.out.println("==========================================");

        Piso piso = new Piso();
        piso.setCommand(new AccionarLamparaCommand(piso.getLampara()));
        piso.executeCommand();
        System.out.println(piso.isLamparaAccionada());

    }

    public static void templateMethod(){
        /**
         * Mantiene una base de estructura para una serie de metodos individuales que se ejecutan en orden
         * y pueden ser implementado manteniendo un orden evitando duplicar codigo
         */
        BaseGameLoader wowLoader = new WorldOfWarcraftLoader();
        wowLoader.load();

        System.out.println("====================================");

        BaseGameLoader diabloLoader = new DiabloLoader();
        diabloLoader.load();
    }

    public static void mediator(){
        /**
         * Clases desacopladas con comunicacion indirecta utilizando un mediador
         * que permite reutilizar un componente en un app diferente
         */
        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();
    }

    public static void memento(){
        /**
         * Salvar y restaurar el estado de un objeto sin revelar detalles de implementacion
         * Delegar a criacao de copia de estado do objeto para o proprio objeto
         */
        Editor editor = new Editor();
        editor.escribir("Like");
        editor.imprimirTexto();
        editor.escribir("Like and");
        editor.imprimirTexto();
        editor.escribir("Like and Subscribe");
        editor.imprimirTexto();
        editor.escribir("Like and Subscribe to Java!");
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();
        editor.deshacer();
        editor.imprimirTexto();
    }

    public static void observer(){
        /**
         * Subscreverse a listas en base a eventos de forma dinamica y escalable
         */
        Tienda tienda = new Tienda();
        tienda.getService().subscribe(Evento.NUEVO_ITEM, new EmailMsgListener("marcelo@live.com"));
        tienda.getService().subscribe(Evento.VENTAS, new EmailMsgListener("marcelo@live.com"));
        tienda.getService().subscribe(Evento.VENTAS, new EmailMsgListener("roncatto@live.com"));
        tienda.getService().subscribe(Evento.NUEVO_ITEM, new MobileAppListener("marcelornt"));
        tienda.nuevaPromocionItem();

        System.out.println("================================================");

        tienda.promocionVenta();

        System.out.println("==================================================");

        tienda.getService().unsuscribe(Evento.VENTAS, new EmailMsgListener("marcelo@live.com"));
        tienda.promocionVenta();
    }
}