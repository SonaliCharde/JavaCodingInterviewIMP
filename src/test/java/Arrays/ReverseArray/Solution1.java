package Arrays.ReverseArray;

public class Solution1 {
    public static void reverseArray(int[] arr){
        int [] reversedArray = new int[arr.length];
        for (int i = 0; i<arr.length; i++){
            reversedArray[i] = arr[arr.length-i-1];
        }
    }

    public static void main(String[] args) {
        int[] original = {1,2,3,4,5};
        reverseArray(original);

    }
}
