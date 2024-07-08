package single_dimensional_arrays;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
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

public class LietKeVaDem {
    
    public static boolean check(int n){
        int x1 = n % 10;
        n /= 10;
        if (n == 0)
            return true;
        while (n != 0){
            int x2 = n % 10;
            n /= 10;
            if (x2 > x1)
                return false;
            x1 = x2;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        while(sc.hasNext()){
            int n = sc.nextInt();
            if (check(n)){
                if (map.containsKey(n))
                    map.put(n, map.get(n) + 1);
                else
                    map.put(n, 1);
            }
        }
        
        Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
        ArrayList<Map.Entry<Integer, Integer>> arr = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entrySet){
            arr.add(entry);
        }
        
        arr.sort(new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
                if (o1.getValue() != o2.getValue())
                    return o2.getValue() - o1.getValue();
                return o1.getKey() - o2.getKey();
            }
        });
        
        for (Map.Entry<Integer, Integer> x : arr){
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
