package behavioral.mediator_pattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LoginButton extends JButton implements Component {
    private Mediator mediator;

    public LoginButton() {
        super("Log in");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.login();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
