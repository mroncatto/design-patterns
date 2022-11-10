package structural.facade_pattern.service;

public class DatabaseService {

    public User getUser(String userId) {
        return new User("A1", "Marcelo", 1000, "USD", "123456LNS");
    }
}
