/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 *
 * @author PP
 */
public class Hand implements Comparable<Hand>{
    private List<Card> cards;
    
    public Hand(){
        this.cards = new ArrayList<>();
    }
    
    public void add(Card card){
        this.cards.add(card);
    }
    
    public void print(){
        for(Card card: this.cards){
            System.out.println(card);
        }
    }
    
    public void sort(){
        Collections.sort(this.cards);
    }

    public int getTotalValue(){
        return this.cards.stream().mapToInt(Card::getValue).sum();
    }
    
    @Override
    public int compareTo(Hand o) {
        return this.getTotalValue() - o.getTotalValue();
    }
    
    public void sortBySuit(){
        SortBySuit sortBySuitSorter = new SortBySuit();
        Collections.sort(cards, sortBySuitSorter);
        BySuitInValueOrder bySuitInValueOrder = new BySuitInValueOrder();
        Collections.sort(cards, bySuitInValueOrder);
    }
}
