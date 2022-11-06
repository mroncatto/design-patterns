package behavioral.command_pattern.commands;

import behavioral.command_pattern.components.receiver.Lampara;

public record AccionarLamparaCommand(Lampara light) implements Command {

    @Override
    public void execute() {
        System.out.println("Accionando Lampara...");
        light.accionarLampara();
    }
}
