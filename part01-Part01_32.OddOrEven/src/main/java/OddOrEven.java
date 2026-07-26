
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
     
        // So, by taking the modulo of a number and two you can find out if it is even or odd !

        System.out.println("Give a number:");
        int number = Integer.valueOf(scan.nextLine());

        if (number %2 == 0){
            System.out.println("Numbe r" + number + " is even.");
        } else { 
            System.out.println("Number " + number + " is odd.");
        }
    }
}
