import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] containers = new String[4];
        containers[0] = "First";
        containers[1] = "0"; // Quantidade no primeiro contêiner
        containers[2] = "Second";
        containers[3] = "0"; // Quantidade no segundo contêiner

        while (true) {
            // Exibe o estado atual dos contêineres
            System.out.println(containers[0] + ": " + containers[1] + "/100");
            System.out.println(containers[2] + ": " + containers[3] + "/100");

            System.out.println("> ");
            String input = scan.nextLine();

            // Verifica se o comando é "quit" antes de processar qualquer coisa
            if (input.equals("quit")) {
                break; // Sai do loop
            }

            // Divide a entrada em comando e valor
            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = 0;

            // Tenta converter o valor para inteiro
            try {
                amount = Integer.valueOf(parts[1]);
            } catch (Exception e) {
                // Se não houver um valor válido, amount permanece 0
            }

            // Garante que o valor não seja negativo
            if (amount < 0) {
                amount = 0;
            }

            // Processa o comando
            if (command.equals("add")) {
                int totalAdded = Integer.valueOf(containers[1]) + amount;
                if (totalAdded > 100) {
                    totalAdded = 100; // Limita o valor máximo a 100
                }
                containers[1] = String.valueOf(totalAdded);
            }

            if (command.equals("move")) {
                int firstMoved = Integer.valueOf(containers[1]) - amount;
                int secondMoved = Integer.valueOf(containers[3]) + amount;

                // Garante que o primeiro contêiner não fique com valor negativo
                if (firstMoved < 0) {
                    secondMoved += firstMoved; // Ajusta o segundo contêiner
                    firstMoved = 0;
                }

                // Garante que o segundo contêiner não ultrapasse 100
                if (secondMoved > 100) {
                    secondMoved = 100;
                }

                containers[1] = String.valueOf(firstMoved);
                containers[3] = String.valueOf(secondMoved);
            }

            if (command.equals("remove")) {
                int totalRemoved = Integer.valueOf(containers[3]) - amount;

                // Garante que o valor não seja negativo
                if (totalRemoved < 0) {
                    totalRemoved = 0;
                }
                containers[3] = String.valueOf(totalRemoved);
            }
        }
    }
}