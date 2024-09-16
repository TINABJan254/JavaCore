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

public class CapSoCoTongBangK {
    
    public static int firstPos(int[] a, int L, int R, int x){
        int res = -1;
        while (L <= R){
            int mid = (L + R) / 2;
            if (a[mid] == x){
                res = mid;
                R = mid - 1;
            }
            else if (a[mid] > x)
                R = mid - 1;
            else
                L = mid + 1;
        }
        return res;
    }
    
     public static int lastPos(int[] a, int L, int R, int x){
        int res = -1;
        while (L <= R){
            int mid = (L + R) / 2;
            if (a[mid] == x){
                res = mid;
                L = mid + 1;
            }
            else if (a[mid] > x)
                R = mid - 1;
            else
                L = mid + 1;
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a, 0, n);
        
        int res = 0;
        for (int i = 0; i < n; i++){
            int L = firstPos(a, i + 1, n - 1, k - a[i]);
            int R = lastPos(a, i + 1, n - 1, k - a[i]);
            if (L != -1)
                res += (R - L + 1);
        }
        
        System.out.println(res);
    }
}
