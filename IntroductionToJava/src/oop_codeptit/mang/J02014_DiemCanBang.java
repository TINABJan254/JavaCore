package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02014_DiemCanBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] p = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                p[i] = a[i];
                if (i != 0){
                    p[i] += p[i - 1];
                }
            }
            boolean flag = false;
            for (int i = 1; i < n - 1; i++){
                int L = p[i - 1];
                int R = p[n - 1] - p[i];
                if (L == R){
                    System.out.print((i + 1) + " ");
                    flag = true;
                }
            }
            
            if (!flag){
                System.out.println("-1");
            }
            else{
                System.out.println("");
            }
        }
    }
}
