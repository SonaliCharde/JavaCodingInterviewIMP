package Arrays.MaxElement;

public class Java001 {
    public static void main(String[] args) {
        int[] ar = {3,5,6,2,8,9,11};
        int length = ar.length;

        int max = ar[0];
        for (int i=0; i<length; i++){
            if (ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}
