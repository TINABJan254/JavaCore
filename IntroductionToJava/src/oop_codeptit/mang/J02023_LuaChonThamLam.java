package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02023_LuaChonThamLam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        if (n * 9 < s || (n > 0 && s == 0)){
            System.out.println("-1 -1");
        }
        else{
            int[] maxn = new int[n];
            int tmp = s;
            for (int i = 0; i < n; i++){
                if (s > 9){
                    s -= 9;
                    maxn[i] = 9;
                }
                else{
                    maxn[i] = s;
                    s = 0;
                }
            }
            
            s = tmp;
            int[] minn = new int[n];
            minn[0] = 1;
            s--;
            for (int i = n - 1; i >= 1; i--){
                if (s > 9){
                    s -= 9;
                    minn[i] = 9;
                }
                else{
                    minn[i] = s;
                    s = 0;
                }
            }
            minn[0] += s;
            
            for (int i = 0; i < n; i++){
                System.out.print(minn[i]);
            }
            System.out.print(" ");
            for (int i = 0; i < n; i++){
                System.out.print(maxn[i]);
            }
            
        }
    }
}
