package string;

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

public class KyTuXuatHienNhieuNhatTrongXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char x : s.toCharArray()){
            if (mp.containsKey(x)){
                mp.put(x, mp.get(x) + 1);
            }
            else{
                mp.put(x, 1);
            }
        }
        
        ArrayList<Map.Entry<Character, Integer>> arr = new ArrayList<>(mp.entrySet());
        Collections.sort(arr, new Comparator<Map.Entry<Character, Integer>>(){
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
                if (o1.getValue() != o2.getValue())
                    return o1.getValue() - o2.getValue();
                if (o1.getKey() < o2.getKey())
                    return -1;
                return 1;
            }
        });
        
        System.out.println(arr.get(arr.size() - 1).getKey() + " " + arr.get(arr.size() - 1).getValue());
        int i = 0;
        while (arr.get(i).getValue() == arr.get(i + 1).getValue()){
            ++i;
        }
        System.out.println(arr.get(i).getKey() + " " + arr.get(i).getValue());
    }
}
