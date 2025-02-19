/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author PP
 */
public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }

            if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dict.add(word, translation);
            } else if (command.equals("search")) {
                System.out.println("To be translated:");
                String toBeTranslated = scanner.nextLine();
                System.out.println(translationCheck(toBeTranslated));
            } else {
                System.out.println("Unknown command");
            }

        }
    }
    
    public String translationCheck(String word){
        if(this.dict.translate(word) == null){
            return "Word " + word + " was not found";
        }
        return "Translation: " + this.dict.translate(word);
    }

}
