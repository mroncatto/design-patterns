package structural.bridge_pattern.implementations;

public abstract class Pizza {
    protected String salsa;
    protected String cobertura;
    protected String masa;

    public abstract void preparar();
    public abstract void verificarCalidad();

    public Pizza() {
    }

    public Pizza(String salsa, String cobertura, String masa) {
        this.salsa = salsa;
        this.cobertura = cobertura;
        this.masa = masa;
    }

    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
}
