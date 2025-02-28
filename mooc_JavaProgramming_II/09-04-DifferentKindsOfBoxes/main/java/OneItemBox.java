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
public class OneItemBox extends Box{
    private ArrayList<Item> capacity;
    
    public OneItemBox(){
        this.capacity = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(this.capacity.isEmpty()){
            this.capacity.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for(Item i:this.capacity){
            if(i.equals(item)){
                return true;
            }
        }
        return false;
    }
    
}
