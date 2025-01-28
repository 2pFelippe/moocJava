
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int input = Integer.valueOf(scanner.nextLine());
        int factor = 1;
        
        if(input == 0){
            System.out.println("Factorial: "+factor);
        }
        
        for( int i = factor; i <= input; i++){
            factor *= i;
        }
        
        System.out.println("Factorial: "+factor);
    }
}
