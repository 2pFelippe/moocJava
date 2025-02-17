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
public class PointList {
    private ArrayList<Integer> points;
    
    public PointList(){
        this.points = new ArrayList<>();
    }
    
    public ArrayList<Integer> getPoints(){
        return this.points;
    }
    
    public void addPoints(int point){
        this.points.add(point);
    }
    
    public double pointsAverage(){
        int total = 0;
        for(int point: this.points){
            total += point;
        }
        
        return 1.0*total/this.points.size();
    }
    
    public double passingPointsAverage(){
        int total = 0;
        int count = 0;
        for(int point: this.points){
            if(point >= 50){
                total += point;
                count ++;
            }
        }
        
        return 1.0*total/count;
    }
    
    public double passingPercentage(){
        int passing = 0;
        for(int point: this.points){
            if(point >= 50){
                passing ++;
            }
        }
        return 100.0 * passing/this.points.size();
    }
}
