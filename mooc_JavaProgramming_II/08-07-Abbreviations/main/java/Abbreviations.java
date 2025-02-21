/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author PP
 */
public class Abbreviations {
    private HashMap<String,String> map;
    
    public Abbreviations(){
        this.map = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.map.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.map.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if(this.map.containsKey(abbreviation)){
            return this.map.get(abbreviation);
        }
        return null;
    }
    
}
