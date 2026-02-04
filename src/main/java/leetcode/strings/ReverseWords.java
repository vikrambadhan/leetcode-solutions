package main.java.leetcode.strings;

public class ReverseWords {
    public String reverseWords(String s) {
        // Trim and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        // Build result in reverse order
        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]);
            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
