package Strings.ReverseStringSentence;

public class Solution1 {
    public static void main(String[] args) {
        String str = "My name is Sonali";
        //String reverse= " ";
       String[] strA = str.split(" ");
        for (int i = strA.length-1; i>=0; i--){
            //reverse= reverse+strA[i];
            System.out.println(strA[i]);
        }

    }
}
