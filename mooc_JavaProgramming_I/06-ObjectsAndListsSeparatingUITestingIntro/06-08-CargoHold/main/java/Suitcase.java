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
public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() >= this.maxWeight) {
            return;
        }
        if (item.getWeight() + totalWeight() <= this.maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {
        if (this.items.isEmpty()) {
            return "no items " + "(" + totalWeight() + "kg)";
        }

        if (this.items.size() == 1) {
            return this.items.size() + " item " + "(" + totalWeight() + "kg)";
        }
        return this.items.size() + " items " + "(" + totalWeight() + "kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }

    }

    public int totalWeight() {
        int total = 0;
        for (Item item : this.items) {
            total += item.getWeight();
        }
        return total;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviest = this.items.get(0);
        for (Item item : this.items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        return heaviest;
    }

}
