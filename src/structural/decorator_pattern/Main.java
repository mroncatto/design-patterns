package structural.decorator_pattern;

public class Main {
    public static void main(String[] args) {
//        - Asigna comportamientos adicionales a un objeto en tiempo
//          de ejecuccion sin romper el codigo ya utilizado
//        - Cada comportamiento es aislado por una clase permitiendo adicionar nuevos decoradores

        INotifier notificarTodos = new FacebookDecorator(new WhatsappDecorator(new Notifier("Bill Gates")));
        notificarTodos.enviar("Hello World");

        System.out.println("==============================");
        INotifier notificarFacebookEmail = new FacebookDecorator(new Notifier("Bill Gates"));
        notificarFacebookEmail.enviar("Hello World Again");
    }
}
