package behavioral.command_pattern.commands;

import behavioral.command_pattern.components.receiver.Cortina;

public record AbrirCerrarCortinaCommand(Cortina cortina) implements Command {
    @Override
    public void execute() {
        System.out.println("Accionando cortina");
        cortina.abrirCerrar();
    }
}
