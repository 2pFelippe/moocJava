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
public class Box implements Packable{
    private ArrayList<Packable> box;
    private double capacity;
    
    public Box(double maximumCapacity){
        this.box = new ArrayList<>();
        this.capacity = maximumCapacity;
    }
    
    public void add(Packable packable){ 
        if(this.weight() + packable.weight() <= capacity){
            this.box.add(packable);
        }
    }
    
    public double weight(){
        double currentWeight = 0;
        for(Packable item: this.box){
            currentWeight += item.weight();
        }
        return currentWeight;
    }
    
    public String toString(){
        return "Box: "+this.box.size()+" items, total weight " + this.weight() + " kg";
    }
}
