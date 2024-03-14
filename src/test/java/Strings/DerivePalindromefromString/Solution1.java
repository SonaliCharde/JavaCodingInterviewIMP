package Strings.DerivePalindromefromString;

public class Solution1 {
    public static void main(String[] args) {
        String s = "12abc56cba21$";

        StringBuilder sb = new StringBuilder(s);

        String r1 = String.valueOf(sb.charAt(2));
        String r2 = String.valueOf(sb.charAt(3));
        String r3 = String.valueOf(sb.charAt(4));
        String r4 = String.valueOf(sb.charAt(7));
        String r5 = String.valueOf(sb.charAt(8));
        String r6 = String.valueOf(sb.charAt(9));

        String result = r1.concat(r2.concat(r3.concat(r4.concat(r5.concat(r6)))));
        System.out.println(result);





    }
}
