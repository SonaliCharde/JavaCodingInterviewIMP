package NewDirectory.Strings.RemoveDuplicatesLetters;

public class Java002 {
    public static void main(String[] args) {
        String str = "Sandeep";
        int length = str.length();

        String ans = " ";

        for (int i = 0; i < length; i++) {
            char temp = str.charAt(i);
            if (temp != ' ') {
                if (ans.indexOf(temp) <= -1) {
                    ans = ans + temp;
                }
            }else {
                    ans = ans + ' ';
                }
            }
            ans = ans.trim();
            System.out.println(ans);


        }


    }

