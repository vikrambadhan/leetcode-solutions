package main.java.leetcode.strings;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        int[] charCount = new int[26];

        for(int i =0; i< s.length(); i++){
            int index = s.charAt(i) - 'a';
            charCount[index]++;
        }

        for(int i =0; i< t.length(); i++){
            int index = t.charAt(i) - 'a';
            charCount[index] --;
        }

        for(int count : charCount ){
            if(count !=0){

                return false;
            }
        }

        return true;
    }
}

