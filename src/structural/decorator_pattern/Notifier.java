package structural.decorator_pattern;

public class Notifier implements INotifier {

    private final String username;
    private final DatabaseService databaseService;

    public Notifier(String username) {
        this.username = username;
        databaseService = new DatabaseService();
    }

    @Override
    public void enviar(String mensaje) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending " + mensaje + " by Email to " + mail);
    }

    @Override
    public String getUsername() {
        return username;
    }
}
