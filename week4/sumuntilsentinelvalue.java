/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;
import java.util.Scanner;

public class sumuntilsentinelvalue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int num = 0;
        
        System.out.println("Enter numbers (type -1 to stop):");
        
        num = scan.nextInt();
        
        while (num != -1) {
            total = total + num;
            num = scan.nextInt();
        }
        
        System.out.println("Final Total: " + total);
    }
}