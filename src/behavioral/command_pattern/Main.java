package behavioral.command_pattern;

import behavioral.command_pattern.commands.AbrirCerrarCortinaCommand;
import behavioral.command_pattern.commands.AccionarLamparaCommand;
import behavioral.command_pattern.commands.AccionarModoParpadeoLamparaCommand;
import behavioral.command_pattern.components.invoker.Habitacion;
import behavioral.command_pattern.components.invoker.Piso;

public class Main {
    public static void main(String[] args) {
//      Ejecuta llamada de metodos en objetos standalone de forma escalable

        Habitacion habitacion = new Habitacion();
        habitacion.setCommand(new AbrirCerrarCortinaCommand(habitacion.getCortina()));
        habitacion.executeCommand();
        System.out.println("Cortina abierta: " + habitacion.cortinaAbierta());

        System.out.println("==========================================");

        Piso piso = new Piso();
        piso.setCommand(new AccionarLamparaCommand(piso.getLampara()));
        piso.executeCommand();
        System.out.println("Lampara ligada: " + piso.isLamparaAccionada());
        piso.setCommand(new AccionarLamparaCommand(piso.getLampara()));
        piso.executeCommand();
        System.out.println("Lampara ligada: " + piso.isLamparaAccionada());
    }
}
