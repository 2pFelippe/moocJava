
import java.util.Scanner;
import java.util.ArrayList;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        double average = 0;
        int sum = 0;

        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }

            if (input > 0) {
                list.add(input);
            }

        }
        for (int num : list) {
            sum += num;
        }
        average = 1.0 * sum / list.size();
        if (average > 0) {
            System.out.println(average);
        } else {
            System.out.println("nnot");
        }
    }
}
