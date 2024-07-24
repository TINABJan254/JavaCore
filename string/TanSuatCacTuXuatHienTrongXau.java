package string;

import java.util.AbstractMap;
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
import java.util.StringTokenizer;
import java.util.TreeMap;

public class TanSuatCacTuXuatHienTrongXau {
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String a[] = s.split("\\s++");
        TreeMap<String, Integer> mp = new TreeMap<>();
        for (String x : a){
            if (mp.containsKey(x)){
                mp.put(x, mp.get(x) + 1);
            }
            else{
                mp.put(x, 1);
            }
        }
        Set<Map.Entry<String, Integer>> se = mp.entrySet();
        for (Map.Entry<String, Integer> entry : se){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("");
        for (String x : a){
            Map.Entry<String, Integer> tmp = new AbstractMap.SimpleEntry<>(x, mp.get(x));
            if (se.contains(tmp)){
                System.out.println(x + " " + mp.get(x));
                se.remove(tmp);
            }
        }
    }
}