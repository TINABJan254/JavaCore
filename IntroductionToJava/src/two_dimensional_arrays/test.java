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
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class test {
    
    static int[] dx = {-1, 0, 0, 1};
    static int[] dy = {0, -1, 1, 0};
    static int n, m, s, t, u, v;
    static int[][] a = new int[55][55];
    
    public static void BFS(){
        a[s][t] = 0;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{s, t});
        while(!q.isEmpty()){
            int[] frontE = q.poll(); //retrieve and remove
            int x = frontE[0];
            int y = frontE[1];
            if (x == u && y == v)
                return ;
            for (int k = 0; k < 4; k++){
                int x1 = x + dx[k];
                int y1 = y + dy[k];
                if (x1 >= 0 && x1 < n && y1 >= 0 && y1 < m && a[x1][y1] == 1){
                    q.offer(new int[]{x1, y1});
                    a[x1][y1] = 0;
                    
                }
            }   
        }
        
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        s = sc.nextInt();
        t = sc.nextInt();
        u = sc.nextInt();
        v = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++){   
                a[i][j] = sc.nextInt();
            }
        
        
    }
}
