package oop_codeptit.mang;

import java.util.*;
import java.math.*;

public class J02103_TichMaTranVoiChuyenViCuaNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++){
            System.out.printf("Test %d:\n", test);
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] t_a = new int[m][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < m; j++){
                    a[i][j] = sc.nextInt();
                    t_a[j][i] = a[i][j];
                }
            }
            
            int[][] res = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    res[i][j] = 0;
                    for (int k = 0; k < m; k++){
                        res[i][j] += a[i][k] * t_a[k][j];
                    }
                }
            }
            
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(res[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
