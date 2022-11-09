package structural.decorator_pattern;

public class WhatsappDecorator extends BaseNotifierDecorator {

    public WhatsappDecorator(INotifier wrapped) {
        super(wrapped);
    }

    @Override
    public void enviar(String mensaje) {
        super.enviar(mensaje);
        String numeroTelefono = databaseService.getPhoneNbrFromUsername(getUsername());
        System.out.println("Sending " + mensaje + " by Whatsapp on " + numeroTelefono);
    }
}
