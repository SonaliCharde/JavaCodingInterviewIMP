package NewDirectory.Strings.PrintDuplicateWordsinString;

public class Java002 {
    public static void main(String[] args) {
        String str = "Big black big sheep";
        int count;

        str= str.toLowerCase();

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
            //Displays duplicate words if the count is greater than 1
            if (count>1 && words[i]!="0")
                System.out.println(words[i]);
        }
    }
}
