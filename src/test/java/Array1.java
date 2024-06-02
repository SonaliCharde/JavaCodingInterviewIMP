import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.util.Collections.reverse;


public class Array1 {
    //Array reverse. Write a method that will take an array as an argument and reverse it.
    public static void main(String[] args) {
        int[] array = {1, 4, 9, 16, 25};
        System.out.println("Before reverse "+ Arrays.toString(array));
        arrayReverse(array);
        System.out.println("After reverse "+Arrays.toString(array));

    }
    static void arrayReverse(int[] array){
        for (int i =0; i<array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1]=temp;

        }
    }

}

