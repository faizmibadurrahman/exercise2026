package W5FOP;

public class n1 {
    public static void main(String[] args) {
        java.util.Random rand = new java.util.Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(rand.nextInt(101) + " "); // 101 ensures numbers from 0 to 100 inclusive
            }
            System.out.println();
        }

    }
}
