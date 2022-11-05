package behavioral.chain_of_responsability_pattern.handlers;

import behavioral.chain_of_responsability_pattern.Database;

public class ValidPasswordHandler extends Handler {
    private Database database;

    public ValidPasswordHandler(Database database) {
        this.database = database;
    }

    @Override
    public boolean handle(String username, String password) {
        if(!database.isValidPassword(username, password)){
            System.out.println("Password incorrecta");
            return false;
        }
        return handleNext(username, password);
    }
}
