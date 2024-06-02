package Strings.ReverseString;

public class Reverse1 {
    public static void main(String[] args) {
        String original = "Sonali";
        //str.toLowerCase();
        String reverse ="";

       int lenght = original.length();

       for (int i =lenght-1; i>=0; i--){
           reverse = reverse+original.charAt(i);
       }
        System.out.println(reverse);

    }
}
