package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02022_SoXaCach {

    public static int n;
    public static int[] x;
    public static boolean[] used = new boolean[20];

    public static boolean check() {
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(x[i] - x[i + 1]) == 1) {
                return false;
            }
        }
        return true;
    }

    public static void display() {
        for (int tmp : x) {
            System.out.print(tmp);
        }
        System.out.println("");
    }

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!used[j]) {
                x[i] = j;
                used[j] = true;
                if (i == n - 1) {
                    if (check()) {
                        display();
                    }
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            x = new int[n];
            Arrays.fill(used, false);
            Arrays.fill(x, 0);
            Try(0);
        }
    }
}
