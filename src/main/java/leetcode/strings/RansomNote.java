package main.java.leetcode.strings;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> hmap = new HashMap<>();

        for(char c : magazine.toCharArray()){
            hmap.put(c, hmap.getOrDefault(c,0) + 1);
        }

        for( char c : ransomNote.toCharArray()){
            if(!hmap.containsKey(c) || hmap.get(c) == 0){
                return false;
            }else{
                hmap.put(c, hmap.get(c) - 1);
            }
        }

        return true;
    }
}
