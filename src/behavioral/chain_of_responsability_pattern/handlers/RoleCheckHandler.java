package behavioral.chain_of_responsability_pattern.handlers;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if("admin".equals(username)){
            System.out.println("Bienvenido admin ...");
            return handleNext(username, password);
        }
        System.out.println("Bienvenido user ...");
        return handleNext(username, password);
    }
}
