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

public class TruyVanTrenMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> mp = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            if (mp.containsKey(x))
                mp.put(x, mp.get(x) + 1);
            else
                mp.put(x, 1);
        }
        
        int Q = sc.nextInt();
        while ((Q--) != 0){
            int choice = sc.nextInt();
            if (choice == 1){
                int x = sc.nextInt();
                if (mp.containsKey(x))
                    mp.put(x, mp.get(x) + 1);
                else
                    mp.put(x, 1);
            }
            else if (choice == 2){
                int x = sc.nextInt();
                if (mp.containsKey(x)){
                    if (mp.get(x) > 1)
                        mp.put(x, mp.get(x) - 1);
                    else
                        mp.remove(x);
                }
            }
            else{
                int x = sc.nextInt();
                if (mp.containsKey(x))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
