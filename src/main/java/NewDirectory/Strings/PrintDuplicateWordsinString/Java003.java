package NewDirectory.Strings.PrintDuplicateWordsinString;

public class Java003 {
    public static void main(String[] args) {
        String str = "Big black sheep with big black ears and big black tail";
        int count;
        str = str.toLowerCase();

        String[] words = str.split(" ");
        System.out.println("Duplicate words are");
        for (int i=0; i< words.length; i++){
            count=1;
            for (int j=i+1; j< words.length; j++){
                if (words[i].equals(words[j])){
                    count++;
                    words[j]="0";
                }
            }
            if (count>1 && words[i]!="0")
                System.out.println(words[i]);
        }
    }
}
