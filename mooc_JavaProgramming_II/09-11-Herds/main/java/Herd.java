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
public class Herd implements Movable {

    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Movable item : this.herd) {
            sb.append(item).append("\n");
        }
        return sb.toString().trim(); 
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable item : this.herd) {
            item.move(dx, dy);
        }
    }

    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

}
