public class StringExample {
    public static void main(String[] args) {

        String expected = "Login Successful";
        String actual = "Login Successful";

        if (expected.equals(actual)) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }

        System.out.println("Length: " + actual.length());
        System.out.println("Uppercase: " + actual.toUpperCase());
    }
}