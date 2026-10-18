/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

import java.util.Arrays;

public class searchandsortminitool {
    public static void main(String[] args) {
        
        int[] scores = {85, 90, 75, 92, 88, 79, 95, 82};
        int target = 92;
        int foundAt = -1;
        
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == target) {
                foundAt = i;
                break; 
            }
        }
        
        if (foundAt != -1) {
            System.out.println("Target " + target + " found at index: " + foundAt);
        } else {
            System.out.println("Target " + target + " not found.");
        }
        
        System.out.println("=".repeat(34));
        
        int[] copiedScores = scores.clone(); 
        Arrays.sort(copiedScores);
        
        System.out.println("Original Array: " + Arrays.toString(scores));
        System.out.println("Sorted Array:   " + Arrays.toString(copiedScores));
        
         //* If we sort the original array, the original index positions of the data will be lost. 
         /* By keeping the original intact, we can still do a linear search later and get the 
         * correct original index (e.g., matching a score to a specific student's ID number).
         */
        
    }
}