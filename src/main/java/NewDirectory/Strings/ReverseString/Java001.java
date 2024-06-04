package NewDirectory.Strings.ReverseString;

public class Java001 {
    public static void main(String[] args) {
        String str = "Sonali";
        int length = str.length();
        String reverse =" ";

        for (int i = length-1;i>=0; i-- ){
            reverse= reverse+str.charAt(i);
        }
        System.out.println(reverse);

    }
}
