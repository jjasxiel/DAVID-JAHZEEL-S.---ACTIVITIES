/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;

public class compoundgrowthtracker {
    public static void main(String[] args) {
        
        int balance = 1000;
        System.out.println("Initial Balance: " + balance);
        
        balance += 500;
        System.out.println(balance);
        
        balance *= 2;
        System.out.println(balance);
        
        balance += 1000;
        System.out.println(balance);
        
        System.out.println("-------------------------");
        
        int count = 5;
        System.out.println(count++); 
        System.out.println(count);   
        
        System.out.println("-------------------------");
        
        int countTwo = 5;
        System.out.println(++countTwo);
        System.out.println(countTwo);
    }
}
