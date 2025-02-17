
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            if(input.equals("")){
                break;
            }
            
            String spaces[] = input.split(" ");
            for(String piece : spaces){
                if(piece.contains("av")){
                    System.out.println(piece);
                }
            }
        }

    }
}
