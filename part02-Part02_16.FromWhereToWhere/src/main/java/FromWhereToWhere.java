
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print(" Where to? ");
        int userInput = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int userStart = Integer.valueOf(scanner.nextLine());

        for (int i = userStart; i <= userInput; i++){
            System.out.println(i);
        }

        // Write your program here
    }
}
