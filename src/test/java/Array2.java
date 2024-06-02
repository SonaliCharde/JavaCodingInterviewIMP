import java.util.Arrays;
import java.util.Collections;

public class Array2 {
    public static void main(String[] args) {
        Integer[] ar1 = {2,5,7,8,3,5,4};
        Reversearray(ar1);
        System.out.println("Reversed array "+ Arrays.toString(ar1));
    }
    static void Reversearray(Integer[] ar1){
        Collections.reverse(Arrays.asList(ar1));

    }
}
