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

public class Giao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, Integer> mp = new LinkedHashMap<>();
        int n = sc.nextInt(), m = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            mp.put(x, 1);
        }
        for (int i = 0; i < m; i++){
            int x = sc.nextInt();
            if (mp.containsKey(x))
                mp.put(x, 2);
        }
        
        Set<Map.Entry<Integer, Integer>> es = mp.entrySet();
        for (Map.Entry<Integer, Integer> entry : es)
            if (entry.getValue() == 2)
                System.out.print(entry.getKey() + " ");
    }
}
/*
Intersection
*/