/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

/**
 *
 * @author vazyl
 */
public class TypeSafeShoppingCalculator {
    public static void main(String[] args) {
        int quantity = 3;
        double unitPrice = 12.50;
        String storeName = "Pet Supplies Plus";
        
        double totalCost = quantity * unitPrice;
        
        System.out.println("Store Name: " + storeName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: $" + unitPrice);
        System.out.println("Total Cost: $" + totalCost);
        // The modulo (%) operator behaves differently with negative operands in Java. 
        // The sign of the result always matches the sign of the dividend (the first operand), rather than the divisor.
    }
}
