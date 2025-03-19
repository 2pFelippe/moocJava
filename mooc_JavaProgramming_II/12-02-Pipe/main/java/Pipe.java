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
public class Pipe<T> {
    ArrayList<T> t;
    
    public Pipe(){
        this.t = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.t.add(value);
    }
    
    public T takeFromPipe(){
        if(this.t.isEmpty()){
            return null;
        }
        
        T helper = this.t.get(0);
        this.t.remove(this.t.get(0));
        return helper;
    }
    
    public boolean isInPipe(){
        if (this.t.isEmpty()){
            return false;
        }
        return true;
    }
    
    
}
