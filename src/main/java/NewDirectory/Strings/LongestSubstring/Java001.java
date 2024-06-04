package NewDirectory.Strings.LongestSubstring;

import java.util.HashMap;
import java.util.Map;

public class Java001 {
    public static String longestSubstring(String str){
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start =0,end=0; end<str.length(); end++) {
            char currchar = str.charAt(end);
            if (visited.containsKey(currchar)){
                start=Math.max(visited.get(currchar)+1,start);
            }
            if (output.length()<end-start+1){
                output=str.substring(start,end+1);
            }
            visited.put(currchar,end);

        }
        return output;
    }

    public static void main(String[] args) {
        String str = "LongestSubstringFindOut";
        System.out.println(longestSubstring(str));
    }

}

