package main.java.leetcode.arrays;

public class MaxNumberOfBalloons {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        // Count required characters
        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        // Since "balloon" needs 2 l's and 2 o's
        int min1 = Math.min(b, a);          // compare b and a
        int min2 = Math.min(l / 2, o / 2);  // compare l and o after division
        int min3 = Math.min(min2, n);       // compare with n

        return Math.min(min1, min3);        // final limiting factor
    }
}
