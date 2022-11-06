package behavioral.command_pattern.components;

import behavioral.command_pattern.commands.Command;

public abstract class Component {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
