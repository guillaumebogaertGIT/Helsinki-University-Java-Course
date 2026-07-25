
import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scanner.nextLine());

        int sumOfNumbers = v1 + v2;
        
        System.out.println("The sum of the numbers is " + sumOfNumbers);


    }
}
