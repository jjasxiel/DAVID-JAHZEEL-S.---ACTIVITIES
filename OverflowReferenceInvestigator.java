/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;

import java.util.Arrays;

public class OverflowReferenceInvestigator {
    public static void main(String[] args) {
        
        System.out.println("--- 1. PRIMITIVE OVERFLOW DEMONSTRATION ---");
        byte myByte = 127; 
        System.out.println("Initial byte value (Maximum): " + myByte);
        
        myByte++; 
        System.out.println("Value after increment (Overflow): " + myByte + "\n");
        
        
        System.out.println("--- 2 & 3. STRING REFERENCE COMPARISONS ---");
        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = "Java";
        
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str2.equals(str3): " + str2.equals(str3));

        System.out.println("str1 == str2: " + (str1 == str2));

        System.out.println("str1 == str3: " + (str1 == str3));
         
        System.out.println("str2 == str3: " + (str2 == str3));
       
         System.out.println();


        System.out.println("--- 4. ARRAY REFERENCE SHARING ---");
        int[] originalArray = {10, 20, 30};
        int[] sharedArray = originalArray; 
        
        System.out.println("Before modification:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));
        
        originalArray[1] = 999; 
        
        System.out.println("\nAfter modifying originalArray[1] = 999:");
        System.out.println("originalArray: " + Arrays.toString(originalArray));
        System.out.println("sharedArray:   " + Arrays.toString(sharedArray));
        System.out.println("(Notice that sharedArray was also updated because they point to the exact same memory location)");
    }
}