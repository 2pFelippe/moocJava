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
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        if(suitcase.totalWeight() + totalWeight(suitcases) <= this.maxWeight){
            this.suitcases.add(suitcase);
        }
    }
    
    public int totalWeight(ArrayList<Suitcase> suitcases){
        int total = 0;
        for(Suitcase suitcase1:suitcases){
            total += suitcase1.totalWeight();
        }
        return total;
    }
    
    public String toString(){
        int total = 0;
        for(Suitcase suitcase:this.suitcases){
            total += suitcase.totalWeight();
        }
        return this.suitcases.size() + " suitcases " + "(" + total + "kg)";
    }
    
    public void printItems(){
        for(Suitcase suitcase:this.suitcases){
            suitcase.printItems();
        }
    }
    
}
