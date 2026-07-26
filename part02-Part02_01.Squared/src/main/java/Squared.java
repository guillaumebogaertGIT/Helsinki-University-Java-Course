
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What do u want to sqaure? ");
        int square = Integer.valueOf(scanner.nextLine());

        System.out.println(square * square);

    }
}
