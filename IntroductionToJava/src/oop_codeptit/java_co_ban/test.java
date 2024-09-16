package oop_codeptit.java_co_ban;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class test {
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
            
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    System.out.print(t_a[i][j] + " ");
                }
                System.out.println("");
            }
            
            int[][] res = new int[n][n];
            for (int i = 0; i < n; i++){
                for (int j = 0; j < n; j++){
                    res[i][j] = 0;
                    for (int k = 0; k < m; k++){
                        res[i][j] += a[i][k] * t_a[k][i];
                    }
                }
            }
            
            
        }
    }
}


