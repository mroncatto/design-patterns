package behavioral.visitor_pattern;

import behavioral.visitor_pattern.model.Banco;
import behavioral.visitor_pattern.model.Empresa;
import behavioral.visitor_pattern.model.Residente;
import behavioral.visitor_pattern.model.Cafeteria;

public interface Visitor {
    void visit(Banco banco);
    void visit(Empresa empresa);
    void visit(Residente residente);
    void visit(Cafeteria cafeteria);
}
