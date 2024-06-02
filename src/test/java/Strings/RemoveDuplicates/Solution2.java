package Strings.RemoveDuplicates;

import java.util.HashSet;
import java.util.Set;

public class Solution2 {
    public static String duplicates(String s){
        Set<Character> set = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i< s.length(); i++){
            Character c = s.charAt(i);
            if (!set.contains(c))
                set.add(c);
                sb.append(s);

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Sandeep";
        int length = s.length();
        System.out.println(duplicates(s));


    }
}
