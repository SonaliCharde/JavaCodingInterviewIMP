package Strings.Removedigits;

public class Solution1 {
    public static void main(String[] args) {
        String str = "123S#$ on4354ali97";
        removeDigits(str);


    }
    public static void  removeDigits(String str){
        char[] ch = str.toCharArray();
        String result = "";
        for (int i=0; i<ch.length; i++){
            if (!Character.isDigit(ch[i])&&!Character.isWhitespace(ch[i])&&Character.isUnicodeIdentifierPart(ch[i])){
                result= result+ch[i];
            }


            }
        if (result.length()>0){
            System.out.println(result);
        }




    }






}
