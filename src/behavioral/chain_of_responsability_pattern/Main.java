package behavioral.chain_of_responsability_pattern;

import behavioral.chain_of_responsability_pattern.handlers.*;

public class Main {
    public static void main(String[] args) {
//      Permite adicionar, remover o reordenar handlers de forma dinamica

        Database database = new Database();
        Handler handler = new UserExistsHandler(database);


//      Si algun handler retorna false, se rombe el chain y valida la regla
        handler.setNextHandler(new ValidPasswordHandler(database))
                .setNextHandler(new RoleCheckHandler())
                .setNextHandler(new UserNotExpiredHandler());

        AutenticacionService service = new AutenticacionService(handler);
        if(service.logIn("admin", "admin_password")){
            System.out.println("Usuario logado!");
        }
    }
}
