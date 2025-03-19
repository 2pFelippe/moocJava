/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Hideout<T> {

    T t;

    public Hideout() {

    }

    public void putIntoHideout(T toHide) {
        this.t = toHide;

    }

    public T takeFromHideout() {
        T helper = this.t;
        if(this.t == null){
            return null;
        }
        
        this.t = null;
        return helper;
    }
    
    public boolean isInHideout(){
        if(this.t == null){
            return false;
        }
        return true;
    }
}
