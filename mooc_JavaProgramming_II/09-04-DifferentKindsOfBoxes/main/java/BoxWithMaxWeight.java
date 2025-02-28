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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;
    private ArrayList<Item> items;
    

    public BoxWithMaxWeight(int capacity) {
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
        
    }

    public void add(Item item) {
        int total = 0;
        for(Item i : this.items){
            total += i.getWeight();
        }
        if (item.getWeight() + total <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public boolean isInBox(Item item) {
         return this.items.contains(item);
    }
}
