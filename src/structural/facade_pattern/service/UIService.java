package structural.facade_pattern.service;

public class UIService {

    public static String getLoggedInUserId(){
        return "";
    }

    public void logIn(String username, String password) {
        System.out.println("Logging in...");
    }

    public void logout() {
        System.out.println("Logging out...");
    }


}
