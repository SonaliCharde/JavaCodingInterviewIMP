package Strings.CountVowels;

public class Solution1 {
    public static void main(String[] args) {
        String str = "Java";
        char[] chars = str.toCharArray();
        int count = 0;
        for (char c :chars){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
                default:
            }
        }
        System.out.println("Vowels = "+count);

    }
}
