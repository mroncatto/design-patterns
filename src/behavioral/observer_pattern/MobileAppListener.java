package behavioral.observer_pattern;

public record MobileAppListener(String username) implements Listener {

    @Override
    public void update(Evento tipoEvento) {
        // Envia la notificacion
        System.out.println("Enviando la notificacion mobile para: " + username + " debido a " + tipoEvento);
    }
}
