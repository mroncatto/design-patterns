package behavioral.mediator_pattern;

public class Main {
    public static void main(String[] args) {
//        Clases desacopladas con comunicacion indirecta utilizando un mediador
//        que permite reutilizar un componente en un app diferente

        Dialog dialog = new Dialog();
        dialog.enterUsername("Geekific");
        dialog.enterPassword("LikeAndSubscribe");

        dialog.simulateLoginClicked();

        dialog.simulateForgotPassClicked();
    }
}
