import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        int count = 0;
        
        try(Scanner fileHandler = new Scanner(Paths.get(file))){
            while(fileHandler.hasNextLine()){
                list.add(Integer.valueOf(fileHandler.nextLine()));
            }
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        
        for(int nums:list){
            if(nums >= lowerBound && nums <= upperBound){
                count++;
            }
        }
        System.out.println("Numbers: "+count);
    }

}
