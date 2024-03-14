package Arrays.ReverseArray;

import java.util.Arrays;

public class Solution2 {
    public static void main(String[] args) {
        int[] arr1 = {1,3,4,5,2,6,7};
        Arrays.sort(arr1);
        for (int i = arr1.length-1;i>=0; i--){
            System.out.println(arr1[i]);
        }

    }
}
