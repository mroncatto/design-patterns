package behavioral.chain_of_responsability_pattern.handlers;

import behavioral.chain_of_responsability_pattern.Database;

public class UserExistsHandler extends Handler {
    private Database database;

    public UserExistsHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidUser(username)){
            System.out.println("Username no registrado");
            return false;
        }
        return handleNext(username, password);
    }
}
