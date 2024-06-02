package Arrays.SortArray;

public class Array1 {
    //Sorting an array without the internal methods
    public static void sortArray(int[] ar1, int length) {
    int temp;
    for (int i=0; i<length; i++){
        for (int j=i+1; j<length;j++){
            if (ar1[i]<ar1[j]){
                temp=ar1[i];
                ar1[i]=ar1[j];
                ar1[j]=temp;
            }
        }

        System.out.println(ar1[i]);
    }

    }

    public static void main(String[] args) {
    int[] ar1 = {8,5,6,3,2,1,9};
    int length = ar1.length;
        sortArray(ar1,length);

    }
}

