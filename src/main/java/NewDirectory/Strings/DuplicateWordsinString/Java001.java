package NewDirectory.Strings.DuplicateWordsinString;

public class Java001 {
    public static void main(String[] args) {
        String str = " Big black sheep with big black ears and big black tail";

        int count;

        //Convert the string to lower case
        str = str.toLowerCase();

        //Split the string to words using builtin function and create a String array
        String[] words = str.split(" ");

        System.out.println("Duplicate words in a String are : ");
        for (int i=0; i< words.length; i++){
            count=1;
            for (int j=i+1; j< words.length; j++){
                if (words[i].equals(words[j])){
                    count++;


                    //Set the words[j] to "0" to avoid visiting repeating words
                    words[j] = "0";

                }
            }

            //Displays duplicate words if the count is greater than 1
            if (count>1 && words[i]!="0")
                System.out.println(words[i]);


        }

    }
}
