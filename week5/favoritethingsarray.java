/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week5;

public class favoritethingsarray {
    public static void main(String[] args) {
        
        String[] favorites = {"House of the Dragon", "The Truman Show", "Roblox", "Hamsters", "Cats"};
        
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        
        System.out.println("Total length: " + favorites.length);
        
    }
}