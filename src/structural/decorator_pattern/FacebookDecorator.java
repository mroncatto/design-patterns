package structural.decorator_pattern;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        String facebookName = databaseService.getFBNameFromUsername(getUsername());
        System.out.println("Sending " + mensaje + " on Facebook to " + facebookName);
    }
}
