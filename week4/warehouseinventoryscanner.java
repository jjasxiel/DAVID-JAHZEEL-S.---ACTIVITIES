/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;

public class warehouseinventoryscanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[][] warehouse = {
            {0, -1, 0},
            {0, 0, 0} 
        };
        
        int choice;
        
        do {
            System.out.println("\n=== WAREHOUSE MENU ===");
            System.out.println("1. Total Inventory");
            System.out.println("2. Find and Restock Low Shelf");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = scan.nextInt();
            
            if (choice == 1) {
                int total = 0;
                
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        if (warehouse[i][j] == -1) {
                            continue; 
                        }
                        total = total + warehouse[i][j];
                    }
                }
                System.out.println("Total Items in Warehouse: " + total);
                
            } else if (choice == 2) {
                boolean found = false;
                
                for (int i = 0; i < warehouse.length; i++) {
                    for (int j = 0; j < warehouse[i].length; j++) {
                        
                        if (warehouse[i][j] != -1 && warehouse[i][j] < 5) {
                            System.out.println("Low shelf found at [" + i + "][" + j + "] (Current stock: " + warehouse[i][j] + ")");
                            
                            int newTotal = doRestock(scan);
                            
                            warehouse[i][j] = newTotal; 
                            
                            found = true;
                            break; 
                        }
                        
                    }
                    if (found == true) {
                        break; 
                    }
                }
                
                if (found == false) {
                    System.out.println("No low shelves found.");
                }
            }
            
        } while (choice != 3);
        
        System.out.println("Exiting system...");
    }
    
    public static int doRestock(Scanner scan) {
        while (true) {
            System.out.print("Enter new total stock (must be greater than 0): ");
            int add = scan.nextInt();
            
            if (add > 0) {
                System.out.println("Restock successful!");
                return add; 
            }
            
            System.out.println("Invalid input. Try again.");
        }
    }
}