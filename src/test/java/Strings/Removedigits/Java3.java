package Strings.Removedigits;

public class Java3 {
    public static void main(String[] args) {
        String str = "$%$^%$SON1234ali$%$ 435 &^%& Charde";
        extractname(str);


    }

    public static void extractname(String str) {
        char[] ar = str.toCharArray();
        String result = "";
        for (int i = 0; i <= ar.length; i++) {
            if (!Character.isDigit(ar[i]) && !Character.isWhitespace(ar[i])
                    && Character.isUnicodeIdentifierPart(ar[i])) {
                result = result + ar[i];
                System.out.println(result.toLowerCase());
            }


        }


    }
}