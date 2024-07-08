package sort_search;

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

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 3);
        map.put(2, 9);
        map.replace(1, 2);
        Set<Map.Entry<Integer, Integer>> entryS = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entryS){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
    
}
