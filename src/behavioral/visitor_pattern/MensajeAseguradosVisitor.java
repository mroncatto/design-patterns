package behavioral.visitor_pattern;

import behavioral.visitor_pattern.model.*;

import java.util.List;

public class MensajeAseguradosVisitor implements Visitor {

    public void enviarCorreoAsegurados(List<Cliente> clientes){
        for(Cliente cliente : clientes){
            cliente.accept(this);
        }
    }

    @Override
    public void visit(Banco banco) {
        System.out.println("Enviando correo sobre seguro contra robos para " + banco.getName());
    }

    @Override
    public void visit(Empresa empresa) {
        System.out.println("Enviando correo sobre seguro en el trabajo a " + empresa.getName());
    }

    @Override
    public void visit(Residente residente) {
        System.out.println("Enviando correo sobre seguros medicos a " + residente.getName());
    }

    @Override
    public void visit(Cafeteria cafeteria) {
        System.out.println("Enviando correo sobre seguro contra incendios a " + cafeteria.getName());
    }
}
