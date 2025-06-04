package abc;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers range = ");
        int sum = 0;
        int num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
   
}
