package W5FOP;

public class fibonaci3 {
    public static void main(String[] args) {
        int f1 = 1;
        int f2 = 2;

        System.out.print(f1 + " " + f2 + " ");
        for(int i = 3; i<=10; i++) {
            int fn = f1+f2;
            System.out.print(fn + " ");

            f1 = f2;
            f2 = fn;
        }
    }
}
