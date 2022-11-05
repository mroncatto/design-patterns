package behavioral.chain_of_responsability_pattern.handlers;

public abstract class Handler {

    private Handler proximo;

    public Handler setNextHandler(Handler proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean handle(String username, String password);

    protected boolean handleNext(String username, String password) {
        if (proximo == null) return true;
        return proximo.handle(username, password);
    }
}
