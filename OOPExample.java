class User {
    String username;
    String password;

    void login() {
        System.out.println(username + " logged in");
    }
}

public class OOPExample {
    public static void main(String[] args) {
        User user1 = new User();
        user1.username = "admin";
        user1.password = "1234";

        user1.login();
    }
}