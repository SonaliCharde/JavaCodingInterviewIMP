package Strings.WordAndCharacterCount;

public class countCharactersTry2 {
    public static void main(String[] args) {
        String str = "Sonali Charde";
        Count(str);
    }
    public static void Count(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i< ch.length; i++){
            String s ="";
            while (i< ch.length && ch[i]!=' '){
                s=s+ch[i];
                i++;
            }
            if (s.length()>0)
                System.out.println(s+ "-Lenght is equal to ="+s.length());
        }

    }
}
