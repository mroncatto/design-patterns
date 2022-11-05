package behavioral.chain_of_responsability_pattern;

import behavioral.chain_of_responsability_pattern.handlers.Handler;

public class AuthService {
    private Handler handler;

    public AuthService(Handler handler){
        this.handler = handler;
    }

    public boolean logIn(String username, String password){
        if(handler.handle(username, password)){
            System.out.println("Login exitoso!!");
            return true;
        }

        return false;
    }
}
