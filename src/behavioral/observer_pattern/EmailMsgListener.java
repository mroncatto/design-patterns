package behavioral.observer_pattern;

public record EmailMsgListener(String email) implements Listener {

    @Override
    public void update(Evento tipoEvento) {
        // Envia el correo
        System.out.println("Enviando correo a: " + email + " debido a " + tipoEvento);
    }
}
