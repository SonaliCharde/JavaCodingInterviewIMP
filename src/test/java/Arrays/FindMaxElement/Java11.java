package Arrays.FindMaxElement;

public class Java11 {

    public static int FindMax(int[] ar){
        int max = ar[0];
        for (int i=0; i<ar.length;i++){
            if (ar[i]>max)
                max=ar[i];
        }
        return max;

    }

    public static void main(String[] args) {
        int[] ar = {19,34,56,23,1,99};
        int maxElement = FindMax(ar);
        System.out.println("Max element in ar is " + maxElement);
    }
}
