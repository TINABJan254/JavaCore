package jJ08012_hinh_sao;

import java.util.*;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] deg = new int[n + 1];
        for (int i = 0; i < n - 1; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            deg[x] += 1;
            deg[y] += 1;
        }
        
        Arrays.sort(deg);
        if (deg[n] != n - 1){
            System.out.println("No");
        } else {
            for (int i = 1; i < n; i++){
                if (deg[i] > 1){
                    System.out.println("No");
                }
            }
            System.out.println("Yes");
        }
    }
}
