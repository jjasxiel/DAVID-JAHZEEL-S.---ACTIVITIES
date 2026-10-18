/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

public class UnitCastingConverter {
    public static void main(String[] args) {
        
        System.out.println("--- CENTIMETER TO METER CONVERTER ---");
        double totalCentimeters = 356.75;
        
        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;
        
        System.out.println("Starting Value: " + totalCentimeters + " cm");
        System.out.println("Converted: " + wholeMeters + " meters and " + remainingCentimeters + " cm\n");


        System.out.println("--- IMPLICIT WIDENING (int -> double) ---");
        // Requirement 3: Implicit widening example
        int originalInt = 45;
        double widenedDouble = originalInt; 
       
        System.out.println("Original int: " + originalInt);
        System.out.println("Widened double: " + widenedDouble + "\n");


        System.out.println("--- EXPLICIT NARROWING (double -> int) ---");
        double exactMeasurement = 85.99;
        int narrowedInt = (int) exactMeasurement;
      
        System.out.println("Original double: " + exactMeasurement);
        System.out.println("Narrowed int: " + narrowedInt);
    }
}