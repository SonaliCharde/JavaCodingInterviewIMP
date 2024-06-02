package Strings.UniqueString;

import java.util.HashSet;
import java.util.Set;

public class Java1 {
    public static void main(String[] args) {
        String str = "Sonalilina";
        unique(str);

    }

    public static String unique(String str) {

       char[] ch = str.toCharArray();
        Set<Character> s = new HashSet<>();
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<str.length();i++){
            if (!s.contains(str.charAt(i))){
                s.add(str.charAt(i));
                sb.append(str.charAt(i));

            }
        }
            return sb.toString();

    }
}
