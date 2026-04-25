public class ControlFlowExample {
    public static void main(String[] args) {

        int bugCount = 5;

        if (bugCount > 0) {
            System.out.println("Fix required");
        } else {
            System.out.println("No bugs");
        }

        for (int i = 1; i <= 4; i++) {
            System.out.println("Executing Test Case " + i);
        }
    }
}