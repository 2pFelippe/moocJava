import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando os objetos na ordem especificada
        Statistics totalStats = new Statistics();
        Statistics evenStats = new Statistics();
        Statistics oddStats = new Statistics();

        System.out.println("Enter numbers:");

        while (true) {
            String input = scanner.nextLine().trim();

            // Verifica se a entrada é "-1", indicando o fim do programa
            if (input.equals("-1")) {
                break;
            }

            // Tenta converter a entrada em um número inteiro
            try {
                int number = Integer.valueOf(input);

                // Adiciona o número às estatísticas totais
                totalStats.addNumber(number);

                // Adiciona o número às estatísticas de pares ou ímpares
                if (number % 2 == 0) {
                    evenStats.addNumber(number);
                } else {
                    oddStats.addNumber(number);
                }

            } catch (NumberFormatException e) {
                // Ignora entradas inválidas
                System.out.println("Invalid input, please enter an integer or -1 to quit.");
            }
        }

        // Imprime os resultados
        System.out.println("Sum: " + totalStats.sum());
        System.out.println("Sum of even numbers: " + evenStats.sum());
        System.out.println("Sum of odd numbers: " + oddStats.sum());
    }
}
