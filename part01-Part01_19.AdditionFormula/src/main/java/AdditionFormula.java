
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Give the first number:");
        int v1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int v2 = Integer.valueOf(scanner.nextLine());

        int sum = v1 + v2;

        System.out.print(v1 + " + ");
        System.out.print( v2 + " = ");
        System.out.print( sum);
    }
}
