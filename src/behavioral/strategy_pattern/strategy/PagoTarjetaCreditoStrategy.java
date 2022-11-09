package behavioral.strategy_pattern.strategy;

import behavioral.strategy_pattern.TarjetaCredito;

public class PagoTarjetaCreditoStrategy implements PagoStrategy {

    private TarjetaCredito tarjeta;


    @Override
    public void colectarDetallesPago() {
        tarjeta = new TarjetaCredito("cardNumber", "expireDate", "cvv");
        System.out.println("Colectando datos de tarjeta de credito");
    }

    @Override
    public boolean validarDetallesPago() {
        System.out.println("Validando tarjeta de credito: " + tarjeta);
        return true;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Pagando " + monto + " utilizando tarjeta de credito");
        tarjeta.setMonto(monto);
    }
}
