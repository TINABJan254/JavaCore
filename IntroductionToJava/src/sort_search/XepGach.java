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

public class XepGach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        Arrays.sort(a, 0, n, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        
        int doCung = 0;
        int res = a[0];
        for (int i = 0; i < n; i++){
            if (doCung > 0)
                ++res;
            else
                break;
            doCung = Math.min(doCung - 1, a[i]);
        }
        
        System.out.println(res);
    }
}