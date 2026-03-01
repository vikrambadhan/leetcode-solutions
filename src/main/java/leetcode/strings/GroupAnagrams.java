package main.java.leetcode.strings;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }
        return new ArrayList<>(map.values());
    }
}

//Optimal Solution
public List<List<String>> groupAnagrams1(String[] strs) {

    Map<String, List<String>> mp = new HashMap<>();

    for (String word : strs) {

        int[] count = new int[26];

        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }

        StringBuilder keyBuilder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            keyBuilder.append("#").append(count[i]);
        }

        String key = keyBuilder.toString();

        if (!mp.containsKey(key)) {
            mp.put(key, new ArrayList<>());
        }

        mp.get(key).add(word);
    }

    return new ArrayList<>(mp.values());
}