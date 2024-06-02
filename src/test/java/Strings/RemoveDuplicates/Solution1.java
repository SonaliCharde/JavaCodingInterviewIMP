package Strings.RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Solution1 {
    public static void main(String[] args) {
        String s = "Sandeep";
        int lenght = s.length();
        removeDuplicates(s);
    }

    public static String removeDuplicates(String s) {
        Set<Character> characterSetset = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= sb.length(); i++) {
            Character c = s.charAt(i);
            if (!characterSetset.contains(c)) {
                characterSetset.add(c);
                sb.append(s);
            }
        }
            return sb.toString();
        }

    }









