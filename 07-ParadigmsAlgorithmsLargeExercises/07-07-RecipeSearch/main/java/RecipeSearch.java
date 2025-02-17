
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RecipeList recipes = new RecipeList();

        System.out.println("File to read");
        String file = scanner.nextLine();
        try (Scanner fileHandler = new Scanner(Paths.get(file))) {
            while (fileHandler.hasNextLine()) {
                String recipeName = fileHandler.nextLine();
                int cookTime = Integer.valueOf(fileHandler.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();
                while (fileHandler.hasNextLine()) {
                    String line = fileHandler.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    ingredients.add(line);
                }

                Recipe recipe = new Recipe(recipeName, cookTime, ingredients);
                recipes.addRecipe(recipe);

            }
            
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            
            while (true) {

                System.out.println("\nEnter command:");
                String input = scanner.nextLine();

                if (input.equals("stop")) {
                    break;
                }

                if (input.equals("list")) {
                    recipes.printList();
                }
                
                if(input.equals("find name")){
                    System.out.println("Searched word:");
                    String word = scanner.nextLine();
                    recipes.findName(word);
                }
                
                if(input.equals("find cooking time")){
                    System.out.println("Max cooking time:");
                    int maxCook = Integer.valueOf(scanner.nextLine());
                    recipes.findMaxCookingTime(maxCook);
                }
                
                if(input.equals("find ingredient")){
                    System.out.println("Ingredient:");
                    String ingredient = scanner.nextLine();
                    recipes.findIngredients(ingredient);
                }
                
                
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
