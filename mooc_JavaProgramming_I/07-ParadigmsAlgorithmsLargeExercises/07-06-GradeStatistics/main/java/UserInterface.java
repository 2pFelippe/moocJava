/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author PP
 */
public class UserInterface {

    public UserInterface() {

    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        PointList pointList = new PointList();
        GradeList gradeList = new GradeList();
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());

            if (input == -1) {
                break;
            }

            if (input < 0 || input > 100) {
                continue;
            }

             
            pointList.addPoints(input);
            gradeList.addGrades(input);
            
        }

        System.out.println("Point average (all): " + pointList.pointsAverage());
        double passingPoints = pointList.passingPointsAverage();
        if (passingPoints == -1) {
            System.out.println("Point average (passing): -");
            System.out.println("Pass Percentage: 0.0");
        }else{
            System.out.println("Point average (passing): " + pointList.passingPointsAverage());
            System.out.println("Pass percentage: " + pointList.passingPercentage());
        }
        int fiveCheck = gradeList.totalCheck(5);
        int fourCheck = gradeList.totalCheck(4);
        int threeCheck = gradeList.totalCheck(3);
        int twoCheck = gradeList.totalCheck(2);
        int oneCheck = gradeList.totalCheck(1);
        int zeroCheck = gradeList.totalCheck(0);
        
        System.out.println("Grade distribution:");
        System.out.print("5:"); printStars(fiveCheck); System.out.println("");
        System.out.print("4:"); printStars(fourCheck); System.out.println("");
        System.out.print("3:"); printStars(threeCheck); System.out.println("");
        System.out.print("2:"); printStars(twoCheck); System.out.println("");
        System.out.print("1:"); printStars(oneCheck); System.out.println("");
        System.out.print("0:"); printStars(zeroCheck);
    }
    
    public void printStars(int numOfTimes) {
        for(int i = 0; i < numOfTimes; i++){
            System.out.print("*");
        }
    }
}
