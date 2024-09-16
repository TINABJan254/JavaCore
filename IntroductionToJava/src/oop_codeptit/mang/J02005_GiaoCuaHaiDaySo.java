package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02005_GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int a[] = new int[1001], b[] = new int[1001];
        for (int i = 0; i < n; i++){
            a[sc.nextInt()]++;
        }
        for (int i = 0; i < m; i++){
            b[sc.nextInt()]++;
        }
        
        for (int i = 0; i < 1001; i++){
            if (a[i] > 0 && b[i] > 0){
                System.out.print(i + " ");
            }
        }
    }
}
