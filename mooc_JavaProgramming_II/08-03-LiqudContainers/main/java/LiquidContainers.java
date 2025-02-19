
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container("First");
        Container second = new Container("Second");
        System.out.println(first);
        System.out.println(second);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if(value < 0){
                value = 0;
            }

            if (command.equals("add")) {
                first.add(value);
            }

            if (command.equals("move")) {
                int removed = first.remove(value);
                second.add(removed);
            }

            if (command.equals("remove")) {
                second.remove(value);
            }

            System.out.println(first);
            System.out.println(second);
        }
    }

}
