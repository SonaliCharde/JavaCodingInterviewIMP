package Strings.ReverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Solution4 {
    //Using Collections

    public static void main(String[] args) {
        String str = "Sonali";
        char ch1[] = str.toCharArray();
        List<Character> list = new ArrayList<>();

        for (char ch : ch1){
            list.add(ch);
        }
        Collections.reverse(list);
        ListIterator<Character> listIterator = list.listIterator();
        System.out.println("-Using ListIterator-");
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
