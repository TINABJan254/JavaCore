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

public class TimKiemSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Map<String, String> mp = new HashMap<>();
        while( n-- != 0){
            String msv = sc.nextLine();
            String ten = sc.nextLine();
            mp.put(msv, ten);
        }
        
        int Q = sc.nextInt();
        while (Q-- != 0){
            String x = sc.next();
            if (mp.containsKey(x))
                System.out.println(mp.get(x));
            else
                System.out.println("NOT FOUND");
        }
    }
}
