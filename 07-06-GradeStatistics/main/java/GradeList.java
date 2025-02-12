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
public class GradeList {

    private ArrayList<Integer> grades;

    public GradeList() {
        this.grades = new ArrayList<>();
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public int addGrades(int point) {
        if (point < 50) {
            this.grades.add(0);
            return -1;
        }
        if (point < 60) {
            this.grades.add(1);
            return -1;
        }
        if (point < 70) {
            this.grades.add(2);
            return -1;
        }
        if (point < 80) {
            this.grades.add(3);
            return -1;
        }
        if (point < 90) {
            this.grades.add(4);
            return -1;
        }
        if (point >= 90) {
            this.grades.add(5);
            return -1;
        }
        return -1;
    }

    
    
    public int totalCheck(int value){
        int checked = 0;
        for(int grade: this.grades){
            if(grade == value){
                checked++;
            }
        }
        
        return checked;
    }


}
