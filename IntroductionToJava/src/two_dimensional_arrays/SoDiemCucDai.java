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

public class SoDiemCucDai {
    
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static int n, m;
    static int[][] a = new int[105][105];
    
    public static boolean check(int i, int j){
        int maxE = -1;
        for (int k = 0; k < 8; k++)
            maxE = Math.max(maxE, a[i + dx[k]][j + dy[k]]);
        
        return a[i][j] > maxE;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i <= n + 1; i++)
            for (int j = 0; j <= m + 1; j++)
                a[i][j] = -1;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                a[i][j] = sc.nextInt();
        
        int res = 0;
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                if (check(i, j))
                    ++res;
        
        System.out.println(res);
    }
}
