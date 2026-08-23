import java.util.*;

public class SumNum {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter First Number: ");
        int b = sc.nextInt();

        int sum = a+b;
        System.out.println("The sum of the numbers are: " + sum);
        sc.close();
    }
}
