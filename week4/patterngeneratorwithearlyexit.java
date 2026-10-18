/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

/**
 *
 * @author vazyl
 */
public class patterngeneratorwithearlyexit {
    public static void main(String[] args) {
        
        System.out.println("=========== PATTERN GENERATOR ===========");
        
        for (int row = 1; row <= 5; row++) {
            
            if (row == 3) {
                continue; 
            }
            
            for (int col = 1; col <= 5; col++) {
                
                if (col > row) {
                    break; 
                }
                
                System.out.print(col + " ");
            }
            
            System.out.println();
        }
        
    }
}
