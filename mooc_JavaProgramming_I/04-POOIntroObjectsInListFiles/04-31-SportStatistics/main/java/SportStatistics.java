
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        ArrayList<Match> match = fileReader(file);
        int games = gameCount(match, team);
        System.out.println("Games: "+games);
        
        int wins = numberOfWins(match, team);
        System.out.println("Wins: "+wins);
        
        int losses = gameCount(match, team) - numberOfWins(match, team);
        System.out.println("Losses: "+losses);
        
    }
    
    public static ArrayList<Match> fileReader(String file){
        ArrayList<Match> list = new ArrayList<>();
        
        try(Scanner fileHandler = new Scanner(Paths.get(file))){
            while(fileHandler.hasNextLine()){
                String row = fileHandler.nextLine();
                String[] parts = row.split(",");
                
                String nameFirst = parts[0];
                String nameSecond = parts[1];
                int pointsFirst = Integer.valueOf(parts[2]);
                int pointsSecond = Integer.valueOf(parts[3]);
                
                list.add(new Match(nameFirst,nameSecond,pointsFirst,pointsSecond));
                
            }
        }
        
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }

    public static int gameCount(ArrayList<Match> list, String team){
        int count = 0;
        for(Match match: list){
            if(match.getNameFirst().equals(team) || match.getNameSecond().equals(team)){
                count++;
            }
        }
        
        return count;
    }
    
    public static int numberOfWins(ArrayList<Match> list, String winner){
        int wins = 0;
        for(Match match:list){
            if(match.matchResult().equals(winner)){
                wins ++;
            }
        }
        return wins;
    }
    
}
