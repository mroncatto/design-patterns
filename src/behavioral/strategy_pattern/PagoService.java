package behavioral.strategy_pattern;

import behavioral.strategy_pattern.strategy.PagoStrategy;

public class PagoService {
    private int monto;
    private boolean incluyeDelivery = true;

    private PagoStrategy pagoStrategy;

    public void procesarPedido(int costo) {
        this.monto = costo;
        pagoStrategy.colectarDetallesPago();
        if (pagoStrategy.validarDetallesPago()) {
            pagoStrategy.pagar(getTotal());
        }
    }

    private int getTotal() {
        return incluyeDelivery ? monto + 10 : monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setIncluyeDelivery(boolean incluyeDelivery) {
        this.incluyeDelivery = incluyeDelivery;
    }

    public void setPagoStrategy(PagoStrategy pagoStrategy) {
        this.pagoStrategy = pagoStrategy;
    }
}
