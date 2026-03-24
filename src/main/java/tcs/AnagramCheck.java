package main.java.tcs;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }
    }
}
