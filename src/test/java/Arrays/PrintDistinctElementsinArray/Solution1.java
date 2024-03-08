package Arrays.PrintDistinctElementsinArray;

import java.util.Arrays;

public class Solution1 {
    static void printDistinctelements(int arr[], int lenght){
        // First sort the array so that
        // all occurrences become consecutive
        Arrays.sort(arr);


        // Traverse the sorted array
        for (int i=0; i<lenght; i++){
            // Move the index ahead while
            // there are duplicates


            while (i<lenght-1 && arr[i]==arr[i+1])
                    i++;
            // print last occurrence of
            // the current element

            System.out.println(arr[i]+" ");

        }

    }
    static void printDistinctelements1(int arr1[], int lenght1){
        // First sort the array so that
        // all occurrences become consecutive
        Arrays.sort(arr1);


        // Traverse the sorted array
        for (int i=0; i<lenght1; i++){
            // Move the index ahead while
            // there are duplicates


            while (i<lenght1-1 && arr1[i]==arr1[i+1])
                i++;
            // print last occurrence of
            // the current element

            System.out.println(arr1[i]+" ");

        }

    }

    public static void main(String[] args) {
        int arr[] ={6, 10, 5, 4, 9, 120, 4, 6, 10};
        int length = arr.length;

        int arr1[] ={6, 10, 5, 3, 9, 120, 5, 6, 11};
        int length1 = arr.length;

        System.out.println("Distinct elements in arr");
        printDistinctelements(arr,length);
        System.out.println("Distinct elements in arr1");
        printDistinctelements1(arr1,length1);


        }

    }



