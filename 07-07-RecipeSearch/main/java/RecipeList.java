/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author PP
 */
public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList(){
        this.recipes = new ArrayList<>();
    }
    
    public void printList(){
        System.out.println("Recipes:");
        for(Recipe recipe:recipes){
            System.out.println(recipe.getName()+", "+"cooking time: "+ recipe.getTime()+".");
        }
    }
    
    public void addRecipe(Recipe recipe){
        this.recipes.add(recipe);
    }
    
    public void findName(String word){
        for(Recipe recipe:recipes){
            if(recipe.getName().contains(word)){
                System.out.println(recipe.getName()+", "+"cooking time: "+ recipe.getTime()+".");
            }
        }
    }
    
    public void findMaxCookingTime(int maxTime){
        for(Recipe recipe:recipes){
            if(recipe.getTime() <= maxTime){
                System.out.println(recipe.getName()+", "+"cooking time: "+ recipe.getTime()+".");
            }
        }
    }
    
    public void findIngredients(String ingredient){
        for(Recipe recipe:recipes){
            for(int i = 0; i < recipe.getIngredients().size(); i++){
                if(recipe.getIngredients().get(i).equals(ingredient)){
                    System.out.println(recipe.getName()+", "+"cooking time: "+ recipe.getTime()+".");
                }
            }
        }
    }
    
}
