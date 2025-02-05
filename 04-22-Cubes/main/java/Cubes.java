
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int cube = 0;
        while(true){
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            
            number = Integer.valueOf(input);
            cube = number*number*number;
            System.out.println(cube);
        }
    }
}
