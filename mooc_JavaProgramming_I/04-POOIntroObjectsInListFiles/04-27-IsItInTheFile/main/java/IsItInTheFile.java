
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        String row = "";

        try (Scanner fileHandler = new Scanner(Paths.get(file))) {
            while (fileHandler.hasNextLine()) {
                row = fileHandler.nextLine();
                
                if(row.contains(searchedFor)){
                    System.out.println("Found!");
                    break;
                }else{
                    row = "";
                }
                
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + " failed");
        }
        
        if(row.equals("")){
            System.out.println("Not found");
        }
    }
}
