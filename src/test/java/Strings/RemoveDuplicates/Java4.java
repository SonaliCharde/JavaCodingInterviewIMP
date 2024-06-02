package Strings.RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Java4 {

    public static void main(String[] args) {
        String str = "Geeks For Geeks";
        int lenght = str.length();
        String ans = "";


        for (int i = 0; i < lenght; i++) {
            char temp = str.charAt(i);
            if (temp != ' ') {
                if (ans.indexOf(temp) <= -1) {
                    ans = ans + temp;
                }
            } else {
                ans = ans + ' ';
            }
        }
        ans = ans.trim();
        System.out.println(ans);
    }
}


