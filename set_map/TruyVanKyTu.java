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
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TruyVanKyTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> mp = new HashMap<>();
        String s = sc.next();
        for (int i = 0; i < s.length(); i++){
            if (mp.containsKey(s.charAt(i)))
                mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            else
                mp.put(s.charAt(i), 1);
        }
        
        Set<Map.Entry<Character, Integer>> ens = mp.entrySet();
        ArrayList<Map.Entry<Character, Integer>> arr = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : ens){
            arr.add(entry);
        }
        
        Collections.sort(arr, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Entry<Character, Integer> o1, Entry<Character, Integer> o2) {
                if (o1.getValue() != o2.getValue())
                    return o1.getValue() - o2.getValue();
                if (o1.getKey() > o2.getKey())
                    return -1;
                return 1;
            }
        });
        
        System.out.println(arr.get(arr.size() - 1).getKey() + " " + arr.get(arr.size() - 1).getValue());
        System.out.println(arr.get(0).getKey() + " " + arr.get(0).getValue());
        System.out.println(arr.size());
    }
}
