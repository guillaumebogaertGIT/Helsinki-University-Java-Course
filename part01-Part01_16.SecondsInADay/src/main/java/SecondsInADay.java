
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinutes = 60;

        System.out.println("How many days would you like to convert to seconds? ");
        int numberOfDays = Integer.valueOf(scanner.nextLine());

       
         
        int calCulationToSeconds = numberOfDays * hoursInDay * minutesInHour * secondsInMinutes;

         System.out.println(calCulationToSeconds);

    
        

    }
}
