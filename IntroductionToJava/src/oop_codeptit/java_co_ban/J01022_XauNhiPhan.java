package oop_codeptit.java_co_ban;

import java.util.*;

public class J01022_XauNhiPhan {
    
    private static long[] F;
    
    public static void init(){
        F = new long[100];
        F[0] = 0;
        F[1] = 1;
        for (int i = 2; i < 93; i++){
            F[i] = F[i - 1] + F[i - 2];
        }
    }
    
    public static char find(int n, long k){
        if (n == 1){
            return '0';
        }
        if (n == 2){
            return '1';
        }
        if (k <= F[n - 2]){
            return find(n - 2, k);
        }
        return find(n - 1, k - F[n - 2]);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            init();
            System.out.println(find(n, k));
            
        }
    }
}
