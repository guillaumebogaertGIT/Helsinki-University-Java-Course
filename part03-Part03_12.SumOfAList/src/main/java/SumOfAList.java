
import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
           
        }
          int sum = 0 ;
            for (int number : list) {
                sum += number ;
            }          
/* 
number does not come from input. It is a new variable created by the for-each loop.

Look at this:

for (int number : list) {
    sum += number;
}

The structure is:

for (type variable : list)

Meaning:

"Take every item from list, and temporarily call it number." */

        System.out.println("Sum: " + sum);

        // toteuta listan lukujen summan laskeminen tänne
    }
}
