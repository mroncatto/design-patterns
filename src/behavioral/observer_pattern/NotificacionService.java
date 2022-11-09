package behavioral.observer_pattern;

import java.util.*;

public class NotificacionService {
    private final Map<Evento, List<Listener>> clientes;

    public NotificacionService() {
        this.clientes = new HashMap<>();
        Arrays.stream(Evento.values()).forEach(evento -> clientes.put(evento, new ArrayList<>()));
    }

    public void subscribe(Evento tipoEvento, Listener listener) {
        clientes.get(tipoEvento).add(listener);
    }

    public void unsuscribe(Evento tipoEvento, Listener listener) {
        clientes.get(tipoEvento).remove(listener);
    }

    public void notificarClientes(Evento tipoEvento) {
        clientes.get(tipoEvento).forEach(listener -> listener.update(tipoEvento));
    }
}
