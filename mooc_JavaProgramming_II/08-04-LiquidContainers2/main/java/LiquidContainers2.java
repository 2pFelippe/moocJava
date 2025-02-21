import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();
        System.out.println("First: " + first);
        System.out.println("Second: " + second);

        while (true) {
            System.out.print("> ");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);
            if (value < 0) {
                value = 0;
            }

            if (command.equals("add")) {
                first.add(value);
            }

            if (command.equals("move")) {
                // Verifica quanto pode ser removido do primeiro contêiner
                int amountToMove = Math.min(first.getTotal(), value);
                first.remove(amountToMove); // Remove do primeiro contêiner
                second.add(amountToMove);   // Adiciona ao segundo contêiner
            }

            if (command.equals("remove")) {
                second.remove(value);
            }

            System.out.println("First: " + first);
            System.out.println("Second: " + second);
        }
    }
}