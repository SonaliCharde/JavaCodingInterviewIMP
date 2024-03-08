package Strings.ReverseString;

import java.util.Scanner;

public class Solution1Try2 {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be reversed");
        original = sc.nextLine().toLowerCase();
        //original.toLowerCase();

        int lenght = original.length();
        for (int i =lenght-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }

        System.out.println("Reversed String is "+reverse);
        if (original.equals(reverse)){
            System.out.println("Input String is a Palindrome");
        }else {
            System.out.println("Input String is not a palindrome");
        }
    }
}
