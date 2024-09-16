package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02007_DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 1; k <= t; k++){
            int n = sc.nextInt();
            int a[] = new int[n], d[] = new int[100005];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
                d[a[i]]++;
            }
            
            System.out.println("Test " + k + ":");
            for (int i = 0; i < n; i++){
                if (d[a[i]] > 0){
                    System.out.println(a[i] + " xuat hien " + d[a[i]] + " lan ");
                    d[a[i]] = 0;
                }
            }
        }
            
    }
}
