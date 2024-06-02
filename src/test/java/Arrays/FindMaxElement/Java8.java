package Arrays.FindMaxElement;

public class Java8 {

    public static int findMax(int[] ar){
        int max = ar[0];
        for (int i=0; i<ar.length; i++){
            if (ar[i]>max)
                max=ar[i];
        }
      return max;
    }

    public static void main(String[] args) {
        int[] ar =  {21,98,13,9,34};
        int maxElement = findMax(ar);
        System.out.println(maxElement);
    }
}
