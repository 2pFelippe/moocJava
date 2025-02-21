/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PP
 */
public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");

            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            if (input.equals("add")) {
                System.out.println("To add:");
                String task = scanner.nextLine();
                this.list.add(task);
            }

            if (input.equals("list")) {
                this.list.print();
            }

            if (input.equals("remove")) {
                System.out.println("Which one is removed?");
                int removed = Integer.valueOf(scanner.nextLine());
                this.list.remove(removed);
            }
        }
    }
}
