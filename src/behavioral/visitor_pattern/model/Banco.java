package behavioral.visitor_pattern.model;

import behavioral.visitor_pattern.Visitor;

public class Banco extends Cliente {

    private final int sucursalesAseguradas;

    public Banco(String name, String address, String number, int sucursalesAseguradas) {
        super(name, address, number);
        this.sucursalesAseguradas = sucursalesAseguradas;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getSucursalesAseguradas() {
        return sucursalesAseguradas;
    }
}
