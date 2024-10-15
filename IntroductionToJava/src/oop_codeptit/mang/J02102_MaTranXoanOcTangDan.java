package oop_codeptit.mang;

import java.util.*;

public class J02102_MaTranXoanOcTangDan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n * n];
        for (int i = 0; i < n * n; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int idx = 0;
        int h1 = 0, h2 = n - 1, c1 = 0, c2 = n - 1;
        int[][] res = new int[n][n];
        while (idx < n*n){
            //top
            for (int i = c1; i <= c2; i++){
                res[h1][i] = a[idx++];
            }
            ++h1;
            
            //right
            for (int i = h1; i <= h2; i++){
                res[i][c2] = a[idx++];
            }
            --c2;
            
            //bottom
            for (int i = c2; i >= c1; i--){
                res[h2][i] = a[idx++];
            }
            --h2;
            
            //left
            for (int i = h2; i >= h1; i--){
                res[i][c1] = a[idx++];
            }
            ++c1;
        }
        
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println("");
        }
        
    }
}
