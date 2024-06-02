package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Java4 {
    public static void main(String[] args) {
        int[] ar = {3,5,4,6,4,5,7,3,2};
        int length = ar.length;
        unique(ar,length);
    }
    public static void unique(int[] ar, int length){
        Arrays.sort(ar);
        for (int i = 0; i<length; i++){
            while (i<length-1 && ar[i]==ar[i]+1){
                i++;
                System.out.println(ar[i]+"");

            }
        }
    }
}
