package oop_codeptit.mang;

import java.util.*;

public class J02035_QuayPhai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            long minE = Long.MAX_VALUE;
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                minE = Math.min(a[i], minE);
            }
            
            for (int i = 0; i < n; i++){
                if (a[i] == minE){
                    System.out.println(i);
                    break;
                } 
            }
            
        }
    }
}
