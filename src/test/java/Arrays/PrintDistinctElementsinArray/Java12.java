package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Java12 {
    public static void printDistinct(int[] ar, int length){
        Arrays.sort(ar);
        for (int i =0; i<length; i++){
            while (i<length-1 && ar[i]==ar[i+1]){
                i++;
                System.out.println(ar[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int[] ar = {2,3,4,2,3,4,5,6,7,6,7,8};
        int length = ar.length;
        printDistinct(ar,length);
    }
}
