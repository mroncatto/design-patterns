package behavioral.mediator_pattern;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Dialog implements Mediator {

    private final JTextField userTextBox = new JTextField();
    private final JTextField passTextBox = new JTextField();
    private final LoginButton loginButton = new LoginButton();
    private final ForgotPasswordButton passwordButton = new ForgotPasswordButton();

    public Dialog() {
        loginButton.setMediator(this);
        passwordButton.setMediator(this);
    }

    @Override
    public void login() {
        System.out.println("Logging in...");
        String username = userTextBox.getText();
        String password = passTextBox.getText();
        // validate username and password
        // logs in the user or pops error message
    }

    @Override
    public void forgotPass() {
        System.out.println("Generating new Password...");
        String username = userTextBox.getText();
        // generate new pass for the user
        // send mail to this username with new pass
    }

    public void enterUsername(String username) {
        userTextBox.setText(username);
    }

    public void enterPassword(String password) {
        passTextBox.setText(password);
    }

    public void simulateLoginClicked() {
        loginButton.fireActionPerformed(new ActionEvent(this, 0, "login"));
    }

    public void simulateForgotPassClicked() {
        passwordButton.fireActionPerformed(new ActionEvent(this, 0, "forgot pass"));
    }
}
