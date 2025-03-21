
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random numGen = new Random();
        
        System.out.println("How many random numbers should be printed?");
        int qtty = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i< qtty; i++){
            System.out.println(numGen.nextInt(11));
        }
        
        
    }

}
