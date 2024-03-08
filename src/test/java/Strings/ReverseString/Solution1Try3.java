package Strings.ReverseString;

import java.util.Scanner;

public class Solution1Try3 {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be revesed");

        original = sc.nextLine();
        //original.toLowerCase();
        int lenght = original.length();

        for (int i = lenght-1; i>=0; i--){
            reverse = reverse+original.toLowerCase().charAt(i);

        }
        System.out.println("Reverse String is "+reverse);
    }
}
