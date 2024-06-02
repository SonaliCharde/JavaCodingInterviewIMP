package Strings.String2Int;

public class Java2 {
    public static void main(String[] args) {
        String str = "123Sonali";
        char[] s = str.toCharArray();
        convert(s);
    }
    public static void convert(char[] s){
        int num = 0;
        int n = s.length;
        for (int i =0; i<n;i++){
            num = num*10 +(s[i]-48);

        }
        System.out.println(num);


    }
}
