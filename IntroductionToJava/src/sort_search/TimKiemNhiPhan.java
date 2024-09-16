package sort_search;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Iterator;

public class TimKiemNhiPhan {
    
    public static int binSearch(int[] a, int n, int x){
        int L = 0, R = n - 1;
        while (L <= R){
            int mid = (L + R) / 2;
            if (a[mid] == x)
                return mid;
            else if (a[mid] < x)
                L = mid + 1;
            else
                R = mid - 1;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a, 0, n);
        
        int Q = sc.nextInt();
        while (Q-- != 0){
            int x = sc.nextInt();
            int pos = binSearch(a, n, x);
            if (pos == -1)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
