package Strings.RemoveDuplicates;

public class Solution1 {
    public static void main(String[] args) {
        String s = "SSonali";
        String ans = "";
        for (int i =0; i<=s.length(); i++){
            char temp = s.charAt(i);
            // checking for space in the string
            if (temp != ' '){
                // checking if the character is already
                // present in the new String if not adding
                // the character to the new string
            if (ans.indexOf(temp)<=-1){
                ans=ans+temp;
            }
            else {
                ans =ans+' ';
            }
            }
            ans = ans.trim();
            System.out.println("Output : "+ans);
        }
    }
}
