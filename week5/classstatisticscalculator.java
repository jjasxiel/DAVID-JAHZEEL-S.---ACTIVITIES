/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

public class classstatisticscalculator {
    public static void main(String[] args) {
        
        int[] scores = {85, 90, 75, 92, 88, 79, 95, 82};
        
        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        
        for (int i = 0; i < scores.length; i++) {
            
            sum = sum + scores[i];
            
            if (scores[i] > highest) {
                highest = scores[i];
            }
            
            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }
        
        double average = sum / (double) scores.length;
        
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highest);
        System.out.println("Lowest score: " + lowest);
        
    }
}