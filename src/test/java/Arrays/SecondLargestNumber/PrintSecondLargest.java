package Arrays.SecondLargestNumber;

import java.util.Arrays;

public class PrintSecondLargest {
    public static int SecondLargest(int[] ar, int length){
        Arrays.sort(ar);
        int max = ar[0];
        for (int i=0; i<length; i++){
            if (ar[i]>max){
                max=ar[i];



            }
        }


        return max;
    }

    public static void main(String[] args) {
        int[] ar = {23,34,45,56,65,67,77,87,98,64,109,304};
        int length = ar.length;
        int secondlargest = SecondLargest(ar,length);
        System.out.println(secondlargest);

    }
}
