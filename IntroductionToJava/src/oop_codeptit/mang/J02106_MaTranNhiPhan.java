package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02106_MaTranNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 0; i < n; i++){
            int cnt = 0;
            for (int j = 0; j < 3; j++){
                int tmp = sc.nextInt();
                cnt += tmp;
            }
            if (cnt > 1){
                ++res;
            }
        }
        
        System.out.println(res);
    }
}
