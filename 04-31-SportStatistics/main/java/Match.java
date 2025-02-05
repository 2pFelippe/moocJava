/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PP
 */
public class Match {

    private String nameFirst;
    private int pointsFirst;
    private String nameSecond;
    private int pointsSecond;

    public Match(String name1, String name2, int points1, int points2) {
        this.nameFirst = name1;
        this.pointsFirst = points1;
        this.nameSecond = name2;
        this.pointsSecond = points2;
    }

    public String getNameFirst() {
        return this.nameFirst;
    }

    public String getNameSecond() {
        return this.nameSecond;
    }

    public int getPointsFirst() {
        return this.pointsFirst;
    }

    public int getPointsSecond() {
        return this.pointsSecond;
    }

    public String toString() {
        return this.nameFirst + ","+this.nameSecond+","+ this.pointsFirst +","+ this.pointsSecond;
    }

    public int gameCount() {
        
        
        return 0;
    }
    
    public String matchResult(){
        String winner = "";
        if(this.pointsFirst > this.pointsSecond){
            winner = this.nameFirst;
        }else{
            winner = this.nameSecond;
        }
        
        return winner;
    }
}
