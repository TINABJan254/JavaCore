package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02034_BoSungDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int maxE = -1;
        int[] fre = new int[205];
        Arrays.fill(fre, 0);
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
            fre[a[i]]++;
            maxE = Math.max(maxE, a[i]);
        }
        
        boolean found = false;
        for (int i = 1; i <= maxE; i++){
            if (fre[i] == 0){
                found = true;
                System.out.println(i);
            }
        }
        
        if (!found){
            System.out.println("Excellent!");
        }
    }
}
