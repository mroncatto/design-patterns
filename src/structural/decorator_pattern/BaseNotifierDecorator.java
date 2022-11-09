package structural.decorator_pattern;

public abstract class BaseNotifierDecorator implements INotifier {
    private final INotifier wrapped;
    protected final DatabaseService databaseService;

    public BaseNotifierDecorator(INotifier wrapped) {
        this.wrapped = wrapped;
        databaseService = new DatabaseService();
    }

    @Override
    public void enviar(String mensaje) {
        wrapped.enviar(mensaje);
    }

    @Override
    public String getUsername() {
        return wrapped.getUsername();
    }
}
