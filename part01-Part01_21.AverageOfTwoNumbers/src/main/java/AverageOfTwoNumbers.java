
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scanner.nextLine());

        
        System.out.println("The average is " + (1.0 * v1+v2)/2);

    }
}
