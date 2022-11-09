package behavioral.visitor_pattern.model;

import behavioral.visitor_pattern.Visitor;

public class Cafeteria extends Cliente {

    private final boolean disponibleExtranjero;

    public Cafeteria(String name, String address, String number, boolean disponibleExtranjero) {
        super(name, address, number);
        this.disponibleExtranjero = disponibleExtranjero;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public boolean isDisponibleExtranjero() {
        return disponibleExtranjero;
    }
}
