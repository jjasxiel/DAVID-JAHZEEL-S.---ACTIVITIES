/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

/**
 *
 * @author vazyl
 */
public class GradeThresholdChecker {
    public static void main(String[] args) {
        
        int average = 85;
        int absences = 5;
        boolean condition = average >= 75 || absences <= 3 && average >= 90;
        
        System.out.println("Did you passed?: " + condition);
    }
}