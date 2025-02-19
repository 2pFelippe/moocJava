/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;
    
    public Timer(){
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString(){
        if(seconds.value() < 10 && hundredths.value() < 10){
            return "0" + seconds.value() + ":" + "0" +hundredths.value();
        }
        if(seconds.value() < 10){
            return "0" + seconds.value() + ":" +hundredths.value();
        }
        
        if(hundredths.value() < 10){
            return seconds.value() + ":" + "0" +hundredths.value();
        }
        
        return seconds.value() + ":" + hundredths.value();
    }
    
    public void advance(){
        hundredths.advance();
        
        if(hundredths.value() == 0){
            seconds.advance();
        }
        
    }
}
