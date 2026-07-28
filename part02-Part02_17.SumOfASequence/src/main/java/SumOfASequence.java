
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int result = 0;

        System.out.print("Last number? ");
        int userInput = Integer.valueOf(scanner.nextLine());

        while (i <= userInput){
            result += i;
            i++;
        }

        System.out.println("The sum is " + result);


        

    }
}
