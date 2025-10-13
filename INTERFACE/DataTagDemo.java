package Interfaces;

interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "12345";
}

public class DataTagDemo {
    public static void main(String[] args) {
        UserCredentials uc = new UserCredentials();
        if (uc instanceof SensitiveData) {
            System.out.println("Encrypt this data before saving");
        }
    }
}

