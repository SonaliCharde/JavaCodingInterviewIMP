package Strings.ReverseString;

import java.util.Scanner;

public class Solution1Try1 {
    public static void main(String[] args) {
        String original, reverse = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to be reversed");
        original = sc.nextLine();

        int lenght = original.length();
        for (int i=lenght-1; i>=0; i--){
            reverse = reverse+original.charAt(i);
        }
        System.out.println("Reverse String is "+ reverse);

    }
}
