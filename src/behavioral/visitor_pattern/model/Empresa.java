package behavioral.visitor_pattern.model;

import behavioral.visitor_pattern.Visitor;

public class Empresa extends Cliente {

    private final int numeroEmpleados;

    public Empresa(String name, String address, String number, int numeroEmpleados) {
        super(name, address, number);
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }
}
