package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02016_BoBaSoPytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++){
                a[i] = sc.nextLong();
                a[i] *= a[i];
            }
            Arrays.sort(a);
            
            int i = n - 1;
            int L = 0, R = i - 1;
            boolean found = false;
            while (R > L){
                if (a[i] == a[R] + a[L]){
                    found = true;
                    break;
                }
                if (a[i] > a[R] + a[L]){
                    ++L;
                }
                else if (a[i] < a[R] + a[L]){
                    --R;
                }
                
                if (R == L){
                    --i;
                    L = 0;
                    R = i - 1;
                }
            }
            
            if (found){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
