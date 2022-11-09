package behavioral.strategy_pattern;

public class TarjetaCredito {
    private int monto = 1_000;
    private final String number;
    private final String date;
    private final String cvv;

    public TarjetaCredito(String number, String date, String cvv) {
        this.number = number;
        this.date = date;
        this.cvv = cvv;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }
}
