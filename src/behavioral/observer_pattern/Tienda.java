package behavioral.observer_pattern;

public class Tienda {

    private final NotificacionService notificacionService;

    public Tienda() {
        notificacionService = new NotificacionService();
    }

    public void nuevaPromocionItem() {
        notificacionService.notificarClientes(Evento.NUEVO_ITEM);
    }

    public void promocionVenta() {
        notificacionService.notificarClientes(Evento.VENTAS);
    }

    public NotificacionService getService() {
        return notificacionService;
    }
}
