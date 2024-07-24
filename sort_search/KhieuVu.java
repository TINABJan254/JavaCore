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

public class KhieuVu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n + 5];
        int[] b = new int[m + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = sc.nextInt();
        
        Arrays.sort(a, 0, n);
        Arrays.sort(b, 0, m);
        
        int i = 0; //index of a
        int j = 0; //index of b
        int res = 0;
        while (i < n && j < m){
            if (a[i] <= b[j])
                ++i;
            else{
                ++res;
                ++i; ++j;
            }
        }
        System.out.println(res);
    }
}
