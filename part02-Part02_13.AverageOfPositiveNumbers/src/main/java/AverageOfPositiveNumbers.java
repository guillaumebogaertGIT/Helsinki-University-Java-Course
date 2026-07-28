import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double count = 0;
        double sumOfPositive = 0;

        while (true) {
            double number = Double.valueOf(scanner.nextLine());

            if (number == 0){
                break;
            }

            if (number > 0){
                count = count +1;
                sumOfPositive = sumOfPositive + number;
            }
        }

        if (count ==0){
            System.out.println("Cannot calculate average");
        } else {
            System.out.println(sumOfPositive / count);
        }

        

            
    }
}
