package main.java.tcs;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // number of terms

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = a + b;
            a = b;
            b = next;
        }
    }
}

