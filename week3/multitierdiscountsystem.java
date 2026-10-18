/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

public class multitierdiscountsystem {
    public static void main(String[] args) {
        
        double purchaseAmount = 750.00;
        int discount = 0;

        if (purchaseAmount >= 1000) {
            discount = 15;
        } else if (purchaseAmount >= 500) {
            discount = 10;
        } else if (purchaseAmount >= 100) {
            discount = 5;
        } else {
            discount = 0;
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount / 100.0);

        System.out.println("Discount Tier: " + discount + "%");
        System.out.println("Final Price: $" + finalPrice);
        
    }
}