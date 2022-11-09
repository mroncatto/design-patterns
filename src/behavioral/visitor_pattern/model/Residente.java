package behavioral.visitor_pattern.model;

import behavioral.visitor_pattern.Visitor;

public class Residente extends Cliente {

    private final String claseSeguro;

    public Residente(String name, String address, String number, String claseSeguro) {
        super(name, address, number);
        this.claseSeguro = claseSeguro;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String getClaseSeguro() {
        return claseSeguro;
    }
}
