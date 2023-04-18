package behavioral.command_pattern.commands;

import behavioral.command_pattern.components.receiver.Lampara;

public record AccionarModoParpadeoLamparaCommand(Lampara lampara) implements Command {

    @Override
    public void execute() {
        System.out.println("Accionando modo parpadeo...");
        lampara.cambiarModoParpadeo();
    }
}
