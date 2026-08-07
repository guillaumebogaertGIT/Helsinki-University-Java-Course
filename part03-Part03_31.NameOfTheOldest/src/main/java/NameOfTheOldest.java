
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int oldest = 0;
        String oldestName = "";

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("")) {
                break;
            }

            String [] parts = string.split(",");

            if (Integer.valueOf(parts[1]) > oldest) {
                oldest = Integer.valueOf(parts[1]);
                oldestName = (parts[0]);
            }
            
        }
        System.out.println("Name of the oldest " + oldestName);


    }
}
