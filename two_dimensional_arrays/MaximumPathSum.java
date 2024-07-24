package two_dimensional_arrays;

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

public class MaximumPathSum {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] a = new int[n + 5][m + 5];
        int[][] f = new int[n + 5][m + 5];
        for (int i = 0; i <= n + 1; i++)
            for (int j = 0; j <= m + 1; j++)
                f[i][j] = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                a[i][j] = sc.nextInt();
        
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                f[i][j] = Math.max(f[i - 1][j], f[i][j - 1]) + a[i][j];
        
        System.out.println(f[n][m]);
    }
}
