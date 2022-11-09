package behavioral.strategy_pattern.strategy;

public interface PagoStrategy {
    void colectarDetallesPago();
    boolean validarDetallesPago();
    void pagar(int monto);
}
