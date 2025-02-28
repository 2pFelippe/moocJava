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
public class ChangeHistory {

    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public String toString() {
        return this.list.toString();
    }

    public double maxValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double max = this.list.get(0);
        for (double value : this.list) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public double minValue() {
        if (this.list.isEmpty()) {
            return 0;
        }
        double min = this.list.get(0);
        for (double value : this.list) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
    
    public double average(){
        if (this.list.isEmpty()) {
            return 0;
        }
        double total = 0;
        for(double value: this.list){
            total += value;
        }
        return total/this.list.size();
    }
}
