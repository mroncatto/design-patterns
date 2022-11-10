package structural.facade_pattern.service;

import structural.decorator_pattern.DatabaseService;

public abstract class CryptoService {

    private DatabaseService databaseService;
    private Validar validar;

    public abstract void buyCurrency(User user, double monto);

    public static class Validar {
    }
}
