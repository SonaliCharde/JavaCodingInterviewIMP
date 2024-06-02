package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Java9 {
    public static void findDistinct(int[]ar, int length){
        Arrays.sort(ar);
        for (int i =0; i<length;i++){
            while (i<length-1&&ar[i]==ar[i+1]){
                i++;
                System.out.println(ar[i]+" ");
            }
        }

    }

    public static void main(String[] args) {
        int ar[] = {6, 10, 5, 3, 9, 120, 5, 6, 11,120};
        int length = ar.length;
        findDistinct(ar,length);
    }
}