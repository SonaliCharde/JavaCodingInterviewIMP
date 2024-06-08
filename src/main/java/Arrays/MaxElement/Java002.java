package Arrays.MaxElement;

public class Java002 {
    public static void main(String[] args) {
        int[] ar = {67,32,54,656,45,35};
        int lenght = ar.length;
        int max = ar[0];
        for (int i=0; i<lenght; i++){
            if (ar[i]>max){
                max=ar[i];
            }
        }
        System.out.println(max);
    }
}
