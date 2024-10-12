package oop_codeptit.mang;

import java.util.*;

public class J02027_KhoangCachNhoHonK {
    
    public static int upper_bound(int[] a, int L, int R, int k){
        int res = -1;
        while (L <= R){
            int mid = (L + R) / 2;
            if (a[mid] > k){
                R = mid - 1;
                res = mid;
            }
            else{
                L = mid + 1;
            }
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }
            
            long res = 0;
            Arrays.sort(a);
            for (int i = 1; i < n; i++){
                int pos = upper_bound(a, 0, i, a[i] - k);
                if (pos != -1){
                    int cnt = i - pos + 1;
                    res += cnt - 1;
                }
            }
            System.out.println(res);
        }
    }
}
