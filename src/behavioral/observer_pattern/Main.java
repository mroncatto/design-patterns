package behavioral.observer_pattern;

public class Main {
    public static void main(String[] args) {
//        Subscreverse a listas en base a eventos de forma dinamica y escalable

        Tienda tienda = new Tienda();
        tienda.getService().subscribe(Evento.NUEVO_ITEM, new EmailMsgListener("billgates@live.com"));
        tienda.getService().subscribe(Evento.VENTAS, new EmailMsgListener("billgates@live.com"));
        tienda.getService().subscribe(Evento.VENTAS, new EmailMsgListener("elonmusk@live.com"));
        tienda.getService().subscribe(Evento.NUEVO_ITEM, new MobileAppListener("markZuckemberg"));
        tienda.nuevaPromocionItem();

        System.out.println("================================================");

        tienda.promocionVenta();

        System.out.println("==================================================");

        tienda.getService().unsuscribe(Evento.VENTAS, new EmailMsgListener("billgates@live.com"));
        tienda.promocionVenta();
    }
}
