package Strings.ReverseString;

public class Solution2 {
    public static void main(String[] args) {

        //Using String Builder
        String s = "Sonali";
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println("Reverse of String is "+sb);
    }
}
