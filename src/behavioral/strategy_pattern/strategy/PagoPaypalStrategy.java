package behavioral.strategy_pattern.strategy;

import behavioral.strategy_pattern.Paypal;

public class PagoPaypalStrategy implements PagoStrategy {

    private Paypal paypal;

    @Override
    public void colectarDetallesPago() {
        paypal = new Paypal("correo@correo.com","123456", "5847-8254");
        System.out.println("Coletando datos de Paypal");
    }

    @Override
    public boolean validarDetallesPago() {
        System.out.printf("Validando pago de paypal de %s \n", paypal.getEmail());
        return true;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Pagando " + monto + " utilizando Paypal");
    }
}
