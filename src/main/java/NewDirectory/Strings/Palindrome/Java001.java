package NewDirectory.Strings.Palindrome;

public class Java001 {
    public static void main(String[] args) {
        String str = "Sonali";
        str = str.toLowerCase();
        int length = str.length();
        String reverse ="";

        for (int i=length-1; i>=0; i--){
            reverse = reverse+str.charAt(i);
        }
        if (str.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
