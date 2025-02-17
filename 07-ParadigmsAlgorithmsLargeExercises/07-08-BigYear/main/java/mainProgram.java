
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        Scanner scanner = new Scanner(System.in);
        Birds birds = new Birds();
        while(true){
            
            System.out.println("?");
            String input = scanner.nextLine();
            
            if(input.equals("Quit")){
                break;
            }
            
            if(input.equals("Add")){
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String ciName = scanner.nextLine();
                
                Bird bird = new Bird(name, ciName);
                birds.add(bird);
            }
            
            if(input.equals("Observation")){
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                birds.addObservation(bird);
            }
            
            if(input.equals("All")){
                birds.printAll();
            }
            
            if(input.equals("One")){
                System.out.println("Bird?");
                String bird = scanner.nextLine();
                birds.printOne(bird);
            }
            
        }
    }

}
