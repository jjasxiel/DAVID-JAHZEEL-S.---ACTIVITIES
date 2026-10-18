/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

public class classrankingsystem {

    // 1. Create a Student class with name and a quizzes array
    static class Student {
        String name;
        int[] quizzes;
        double average;

        // Constructor
        Student(String name, int[] quizzes) {
            this.name = name;
            this.quizzes = quizzes;
            
            // Computin agad ang average pagka-create ng object
            int sum = 0;
            for (int i = 0; i < quizzes.length; i++) {
                sum = sum + quizzes[i];
            }
            this.average = sum / (double) quizzes.length;
        }
    }

    public static void main(String[] args) {
        
        // 2. Build an array of Student objects from a 2D array of raw quiz data
        String[] names = {"Ana", "Ben", "Carl", "Dan", "Eve"};
        
        // 2D Array: (4 scores bawat isa). Mapapansin mo na parehas ang average ni Ben at Carl (TIE)
        int[][] rawScores = {
            {90, 92, 88, 90}, // Ana (90.0)
            {85, 80, 85, 90}, // Ben (85.0)
            {85, 85, 85, 85}, // Carl (85.0) - TIE kay Ben
            {70, 75, 70, 65}, // Dan (70.0)
            {95, 95, 98, 100} // Eve (97.0)
        };

        // Pagpasok ng raw data sa array of Objects
        Student[] list = new Student[5];
        for (int i = 0; i < list.length; i++) {
            list[i] = new Student(names[i], rawScores[i]);
        }

        // 3. OWN sort algorithm (Bubble Sort - Descending)
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                
                // Kapag mas mababa ang average, ililipat sa kanan
                if (list[j].average < list[j + 1].average) {
                    Student temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        // 4. Print formatted leaderboard and correctly handle a tie
        System.out.println("=========== LEADERBOARD ===========");
        int currentRank = 1;
        
        for (int i = 0; i < list.length; i++) {
            // Tie Logic: Kung hindi siya ang una, at iba ang average niya sa nasa itaas niya, update rank.
            // Kung parehas sila (tie), hindi mag-a-update ang currentRank kaya parehas silang "Rank X"
            if (i > 0 && list[i].average != list[i - 1].average) {
                currentRank = i + 1;
            }
            
            System.out.println("Rank " + currentRank + ": " + list[i].name + " - Average: " + list[i].average);
        }
        
        System.out.println("\n=========== SEARCH RANK ===========");
        
        // 5. OWN linear search returning a student's rank
        String targetName = "Ben";
        int targetRank = -1;
        int searchRank = 1; // Kailangang i-compute ulit ang tie logic habang nag-se-search
        
        for (int i = 0; i < list.length; i++) {
            if (i > 0 && list[i].average != list[i - 1].average) {
                searchRank = i + 1;
            }
            
            if (list[i].name.equals(targetName)) {
                targetRank = searchRank;
                break; // Tigil na sa paghahanap kapag nahanap na
            }
        }
        
        System.out.println("Target student '" + targetName + "' is currently at Rank " + targetRank);
    }
}
