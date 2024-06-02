package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Java10 {
    public static void findDistinct(int[] ar, int length){
        Arrays.sort(ar);
        for (int i =0; i<length; i++){
            while (i<length-1 && ar[i]==ar[i+1]){
                i++;
                System.out.println(ar[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] ar = {21,4,3,22,5,3,6,2,7,45,34,54,45,2,6,90,56,90};
        int length = ar.length;
        findDistinct(ar,length);
    }
}
