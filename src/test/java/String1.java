public class String1 {


    public static String ReversingString(String str) {

        String reverse = " ";

        char[] ch = str.toCharArray();
        int lenght = ch.length;

        for (int i = lenght - 1; i >= 0; i--) {
            reverse = reverse +ch[i];

        }
        System.out.println(reverse);

        return reverse;
    }




    public static void main(String[] args) {
        String str = "Sonali";
        ReversingString(str);
    }
}

