package Arrays.FindMaxElement;

public class Java7 {
    static int[] ar =  {21,98,13,9,34};

    public static void main(String[] args) {
        int maxelement = findMax();
        System.out.println(maxelement);

    }
    public static int findMax(){
        int max = ar[0];
        for (int i =0; i<ar.length; i++){
            if (ar[i]>max)
                max=ar[i];
        }
        return max;
    }
}
