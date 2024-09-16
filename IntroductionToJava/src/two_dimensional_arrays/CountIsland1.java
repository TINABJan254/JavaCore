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

public class CountIsland1 {
    
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int n, m;
    static int[][] a = new int[55][55];
    
    public static void DFS(int i, int j){
        a[i][j] = 0;
        for (int k = 0; k < 4; k++){
            int x1 = i + dx[k];
            int y1 = j + dy[k];
            if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m && a[x1][y1] == 1)
                DFS(x1, y1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        
        int res = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == 1){
                    ++res;
                    DFS(i, j);
                }
        
        System.out.println(res);
    }
}
