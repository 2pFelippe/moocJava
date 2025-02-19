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
public class Birds {
    private ArrayList<Bird> birds;
    
    public Birds(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }
    
    public String addObservation(String bird){
        for(Bird birdi: this.birds){
            if(birdi.getName().equals(bird)){
                birdi.addObservation();
                return "";
            }
        }
        System.out.println("Not a bird!");
        return "";
    }
    
    public void printAll(){
        for(Bird bird:this.birds){
            bird.printBird();
        }
    }
    
    public void printOne(String name){
        for(Bird bird:this.birds){
            if(bird.getName().equals(name)){
                bird.printOneBird(name);
            }
        }
    }
}

