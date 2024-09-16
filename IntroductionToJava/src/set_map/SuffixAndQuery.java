package set_map;

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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class SuffixAndQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> se = new HashSet<>();
        int n = sc.nextInt();
        int[] a = new int[n + 5];
        int[] f = new int[n + 5];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = n - 1; i >= 0; i--){
            se.add(a[i]);
            f[i] = se.size();
        }
        
        int Q = sc.nextInt();
        while (Q-- != 0){
            int L = sc.nextInt();
            System.out.println(f[L]);
        }
    }
}
/*

*/