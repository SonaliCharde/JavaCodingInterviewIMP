package Strings.ReverseString;

public class Reverse1Try1 {

    public static void main(String[] args) {
        String s = "Sonali";
        String reverse = "";
        int length = s.length();
        for (int i=length-1; i>=0; i--){
            reverse = reverse+s.charAt(i);
        }
        System.out.println(reverse);

    }
}

