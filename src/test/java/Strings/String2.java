package Strings;

import java.util.Arrays;

public class String2 {
    //Reverse words. Write a method that will take a string as an argument.
    // The method will reverse the position of words and return it.
    public static void main(String[] args) {

        String str = "My name is Sonali";
        reverseString(str);


    }


    public static void reverseString(String str) {


      String[] s1 = str.split(" ");
      int length = s1.length;
      for (int i = s1.length-1; i>=0; i--){
          String reverse = s1[i];
          System.out.println(reverse);
      }


    }


}
