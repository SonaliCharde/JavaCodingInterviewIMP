package Strings.ReverseString;

import javax.swing.*;

public class Solution3 {
    public static void main(String[] args) {
        String s = "Sonali";
        char[] str = s.toCharArray();
        int n = s.length();

        for (int i =n-1; i>=0; i-- ){
            System.out.println(s.charAt(i)+"");
        }
    }

}
