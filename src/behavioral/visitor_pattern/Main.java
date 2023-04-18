package behavioral.visitor_pattern;

import behavioral.visitor_pattern.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//        - Aislamiento de comportamientos de objetos con cada operador y operando en la misma clase
//        - Clases focadas en su trabajo principal respetando la single responsability
//        - Visitors pueden intercambiarse por clientes en tiempo de ejecuccion

        List<Cliente> clientes = List.of(
                new Banco("Nombre Banco", "Direccion Banco", "00 000-0000", 5),
                new Residente("Nombre Residente", "Direccion Resident", "00 000-0000", "medico"),
                new Empresa("Nombre Empresa", "Direccion Empresa", "00 000-0000", 50),
                new Cafeteria("Nombre cafeteria", "Direccion Cafeteria", "00 000-0000", false)
        );

        MensajeAseguradosVisitor visitor = new MensajeAseguradosVisitor();
        visitor.enviarCorreoAsegurados(clientes);

    }
}
