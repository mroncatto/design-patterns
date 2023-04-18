package behavioral.chain_of_responsability_pattern.handlers;

public class UserNotExpiredHandler extends Handler {


    @Override
    public boolean handle(String username, String password) {
        // Logica de negocio para usuario expirado
        System.out.println("User not expired!");
        return handleNext(username, password);
    }
}
