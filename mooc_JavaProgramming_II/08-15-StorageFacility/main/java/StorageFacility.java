/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author PP
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> facility;
    
    public StorageFacility(){
        this.facility = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.facility.putIfAbsent(unit, new ArrayList<>());
        
        this.facility.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(!(this.facility.keySet().contains(storageUnit))){
            return new ArrayList<>();
        }
        return this.facility.get(storageUnit);
    }
    
    public void remove(String storageUnit, String item){
        if(this.facility.get(storageUnit).size() == 1){
            this.facility.remove(storageUnit);
        }else{
            this.facility.get(storageUnit).remove(item);
        } 
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> list = new ArrayList<>();
        for(String unit: this.facility.keySet()){
            if(this.facility.get(unit).size()>0){
                list.add(unit);
            }
        }
        return list;
    }
}
