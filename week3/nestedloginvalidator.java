/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

public class nestedloginvalidator {
    public static void main(String[] args) {
        
        String username = "admin";
        String password = "abc"; 
        boolean isLocked = false; 

        if (username.equals("admin")) {
            if (password.equals("1234")) {
                if (isLocked == false) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Account is Locked");
                }
            } else {
                System.out.println("Wrong Password");
            }
        } else {
            System.out.println("Wrong Username");
        }
        
    }
}