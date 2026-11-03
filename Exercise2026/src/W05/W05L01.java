package W5FOP;
import java.util.Scanner;

public class tut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num = scanner.nextInt();
        
        int factorCount = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factorCount++;
            }
        }

        int[] factors = new int[factorCount];

        int index = 0;
        for(int i = 1; i<=num; i++) {
            if(num%i==0){
                factors[index]=i;
                index++;
            }
        }

        System.out.print("The factors are: ");
        for (int i = 0; i < factors.length; i++) {
            System.out.print(factors[i]);
            if (i < factors.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        
        scanner.close();

    }
}
