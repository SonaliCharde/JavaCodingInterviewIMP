package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class SolutioniTry2 {
    public static void uniqueElements(int[] ar, int length) {
        Arrays.sort(ar);
        for (int i = 0; i < length; i++) {

          while (i<length-1 && ar[i]!=ar[i]+1){
              i++;


            }
            System.out.println(ar[i]+ "");

        }


    }


            public static void main (String[]args){
                int[] ar = {2, 4, 5, 6, 3, 2, 3, 4};
                int length = ar.length;
            uniqueElements(ar, length);
            }
        }
