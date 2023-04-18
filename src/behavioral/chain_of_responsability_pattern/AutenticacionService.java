package behavioral.chain_of_responsability_pattern;

import behavioral.chain_of_responsability_pattern.handlers.Handler;

public class AutenticacionService {
    private Handler handler;

    public AutenticacionService(Handler handler){
        this.handler = handler;
    }

    public boolean logIn(String username, String password){
        return handler.handle(username, password);
    }
}
