
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number:");
        int v3 = Integer.valueOf(scanner.nextLine());

        int sumAll = v1 + v2 + v3 ;
        System.out.println("The sum of the numbers is " + sumAll);

    }
}
