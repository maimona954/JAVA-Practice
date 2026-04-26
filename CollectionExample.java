import java.util.ArrayList;

public class CollectionExample {
    public static void main(String[] args) {

        ArrayList<String> testCases = new ArrayList<>();

        testCases.add("Login Test");
        testCases.add("Signup Test");
        testCases.add("Checkout Test");

        for (String test : testCases) {
            System.out.println(test);
        }
    }
}