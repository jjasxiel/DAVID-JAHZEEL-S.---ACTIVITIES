/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;

public class atmtransactionauthorizer {
    public static void main(String[] args) {
        String user = "admin";
        int pin = 1234;
        double bal = 6000.0;
        double withdraw = 2500.0;
        
        String tier = "";
        double fee = 0.0;
        double limit = 0.0;

        if (user.equals("admin")) {
            if (pin == 1234) {
                
                if (bal >= 10000) { tier = "Platinum"; }
                else if (bal >= 5000) { tier = "Gold"; }
                else if (bal >= 1000) { tier = "Silver"; }
                else { tier = "Bronze"; }

                switch (tier) {
                    case "Platinum": fee = 0.00; limit = 10000; break;
                    case "Gold":     fee = 0.01; limit = 5000;  break;
                    case "Silver":   fee = 0.02; limit = 2000;  break;
                    case "Bronze":   fee = 0.05; limit = 500;   break;
                }

                double total = withdraw + (withdraw * fee);

                if (withdraw <= limit) {
                    if (total <= bal) {
                        System.out.println("APPROVE");
                    } else {
                        System.out.println("DENY: Insufficient balance");
                    }
                } else {
                    System.out.println("DENY: Exceeds limit");
                }

            } else {
                System.out.println("DENY: Wrong PIN");
            }
        } else {
            System.out.println("DENY: Wrong User");
        }
    }
}
