package Strings.SplitString;

public class StringclassSplitMethod {
    public static void main(String[] args) {
        String str = "091-563526543654265";
        Split(str);

    }
    public static void Split(String str){
        String[] str1 = str.split("-");

        for (String s1:str1){
            System.out.println(s1);
        }

    }


}
