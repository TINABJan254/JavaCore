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

public class SetWith_floor_ceiling_lower_higher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> ts = new TreeSet<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int x = sc.nextInt();
            ts.add(x);
        }
        
        int Q = sc.nextInt();
        while (Q-- != 0){
            int choice = sc.nextInt(); 
            if (choice == 1){
                int x = sc.nextInt();
                ts.add(x);
            }
            else if (choice == 2){
                int x = sc.nextInt();
                ts.remove(x);
            }
            else if (choice == 3){
                int x = sc.nextInt();
                System.out.println(ts.ceiling(x));
            }
            else if (choice == 4){
                int x = sc.nextInt();
                System.out.println(ts.floor(x));
            }
        }
    }
}
/*

*/