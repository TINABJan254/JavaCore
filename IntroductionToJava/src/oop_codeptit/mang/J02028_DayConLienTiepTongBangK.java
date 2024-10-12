package oop_codeptit.mang;

import java.util.*;

public class J02028_DayConLienTiepTongBangK {
    
    public static boolean check(int[] a, int n, long k){
        long sum = 0;
            HashSet<Long> hs = new HashSet<>();
            for (int i = 0; i < n; i++){
                sum += a[i];
                if (sum == k || a[i] == k || hs.contains(sum - k)){
                    return true;
                }
                hs.add(sum);
            }
            return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            if (check(a, n, k)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
