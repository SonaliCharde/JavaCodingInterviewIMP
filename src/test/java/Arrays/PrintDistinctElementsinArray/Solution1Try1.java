package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Solution1Try1 {
    static void Finddistinct(int[] ar, int lenght) {
        Arrays.sort(ar);
        for (int i = 0; i < lenght; i++) {
            while (i<lenght-1 && ar[i]==ar[i+1]);
                i++;
            System.out.println(ar[i]+"");

            }

        }


    public static void main(String[] args) {
        int[] ar = {6, 10, 5, 4, 9, 120, 4, 6, 10};
        int lenght = args.length;

        Finddistinct(ar,lenght);
    }

}
