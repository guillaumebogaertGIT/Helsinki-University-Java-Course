
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.println("File: ");
        String file = scanner.nextLine();

        System.out.println("Team: ");
        String team = scanner.nextLine();

        int games = 0;
        int wins = 0;
        int loses = 0;

        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts [1];
                int homePoints = Integer.valueOf(parts[2]);
                int awayPoints = Integer.valueOf((parts[3]));

                if (team.equals(homeTeam) || team.equals(awayTeam)) {
                    games++;
                }
                if (team.equals(homeTeam)) {
                    if (homePoints > awayPoints) {
                        wins++;
                    } else {
                        loses++;
                    }
                    
                }
                if (team.equals(awayTeam)) {
                        if (awayPoints > homePoints) {
                            wins++;
                        } else {
                            loses++;
                        }
                    }
                

            }
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);
       

    }

}
