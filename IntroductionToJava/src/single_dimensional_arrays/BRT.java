package single_dimensional_arrays;

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

public class BRT {
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr.add(x);
        }
        Collections.sort(arr);
        
        TreeMap<Integer, Long> mp = new TreeMap<>();
        for (int i = 0; i < arr.size() - 1; i++){
            if (mp.containsKey(arr.get(i + 1) - arr.get(i)))
                mp.put(arr.get(i + 1) - arr.get(i), mp.get(arr.get(i + 1) - arr.get(i)) + 1);
            else
                mp.put(arr.get(i + 1) - arr.get(i), 1L);
        }
        
        System.out.println(mp.firstKey() + " " + mp.get(mp.firstKey()));
        
        }
}
